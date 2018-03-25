$( document ).ready(function() {
   $(".chat_list>li").unbind().click(function(){
	   $('.chat-title').html($(this).find('.align-self-start').html());
	   var reciever_user_id = $(this).attr("data-userid");
	   var current_user_id = $(this).parent().attr("data-currentuserid");
	   $('.chat_result').attr('data-reciever_user_id',reciever_user_id);
	   
	   $.get( "loadchatservice",{reciever_user_id:reciever_user_id,current_user_id:current_user_id} ,function( data ) {
		   $( ".chat_result" ).html( data );
		   alert( "Load was performed." );
		 });
   });
   
   $( ".chat_list>li" ).each(function( index ) {
	   if(index===0){
		   $(this).trigger( "click" );
	   }
	 });
   
   
   $('.chat-send').unbind().click(function(){
	   var reciever_user_id = $('.chat_result').attr('data-reciever_user_id');
	   var chat_message= $('#exampleTextarea').val();
	   $('#exampleTextarea').val('');
	   var current_time=new Date().toLocaleTimeString('en-US', { hour: 'numeric', hour12: true, minute: 'numeric' });
	   var right_div='<div class="chat-right ml-2 mr-2 w-100"> <div class="chat-bg-right m-2 p-2"> <div class="d-flex flex-row-reverse"> <div class="align-items-end flex-column">online '+current_time+' today</div> <div class="dot_green align-self-center mr-1 mt-1 "></div> </div> <div class="card card-inverse card-primary mb-3 text-center ml-2 mr-2"> <div class="card-block">'+
	   chat_message+' </div> </div> </div> </div>';
	   $('.chat_result').append(right_div);
	   
	   $.get( "loadchatservice",{chat_message:chat_message,reciever_user_id:reciever_user_id} ,function( data ) {
		  
		 });
	   
   });
});