<!DOCTYPE html>
<%@page import="org.apache.kafka.clients.consumer.ConsumerRecord"%>
<%@page import="org.apache.kafka.clients.consumer.ConsumerRecords"%>
<%@page import="java.util.Arrays"%>
<%@page import="org.apache.kafka.clients.consumer.KafkaConsumer"%>
<%@page import="java.util.Properties"%>
<html>
<head>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>


<%

Properties props = new Properties();
props.put("bootstrap.servers", "localhost:9092");
props.put("group.id", "4555544");
props.put("enable.auto.commit", "true");
props.put("auto.commit.interval.ms", "1000");
props.put("auto.offset.reset", "earliest");
props.put("session.timeout.ms", "30000");
props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(props);
kafkaConsumer.subscribe(Arrays.asList("test"));

  

%>
</head>
<body>

<h2>HTML Table</h2>

<table>
  <tr>
    <th>Company</th>
    <th>Contact</th>
</tr>

    <%
      ConsumerRecords<String, String> records = kafkaConsumer.poll(100);
      for (ConsumerRecord<String, String> record : records) {
    	
        System.out.printf("offset = %d, value = %s", record.offset(), record.value());
        System.out.println();
      }
    %>
 
  
</table>

</body>
</html>
