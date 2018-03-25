package service;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

/**
 * Servlet implementation class ProducerServlet
 */
public class ProducerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProducerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String msg = "kalu lal";
		try {
		msg = request.getParameter("val");
		}catch(Exception e) {
			System.out.println("request param not found");
		}
		Properties props = new Properties();
		props.put("bootstrap.servers", "localhost:9092,localhost:9093");
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		System.out.println("all user start time" + System.currentTimeMillis());
		System.out.println("all user end time" + System.currentTimeMillis());

		
				Producer<String, String> producer = new KafkaProducer<>(props);
				/*ProducerRecord<String, String> record = new ProducerRecord<>(topicName, Integer.toString(user.getId()),
						jsonObject.toString());*/
				producer.send(new ProducerRecord<String, String>("test", msg));
				producer.close();
				response.getWriter().println("done");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
