
<!DOCTYPE html>
<%@page import="com.HttpUtil"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<jsp:include page="inc/head.jsp"></jsp:include>
</head>

<body>

	<jsp:include page="inc/navbar.jsp"></jsp:include>

	<div class="container">
		<div class="starter-template">

			<div class="row">
				<div class="col-md-4 gray-bg">
					<div class="m-2 p-2	">
						<input class="form-control mr-sm-2" type="text"
							placeholder="Search">
					</div>
					<div class="height-300-scroll">
						<ul class="list-group chat_list gray-bg m-2 p-2 	" data-currentuserid="189">
							<%
							String response = HttpUtil.sendGet("", "GET");
							
							
								for (int i = 0; i < 100; i++) {
							%>
							<li
								class="list-group-item justify-content-start gray-bg border-0 white-text" data-userid="<%=i %>">
								<img src="//placehold.it/300" class="rounded-circle square-50" />

								<div class="ml-2 align-self-start mt-1">Cras justo odio<%=i %></div>
								<div class="w-100 d-flex"
									style="margin-left: 3.5rem; margin-top: -22px;">
									<div class="dot_green align-self-center mr-1 mt-1"></div>
									<div>online</div>
								</div>

							</li>
							<%
								}
							%>

						</ul>
					</div>
				</div>
				<div class="col-md-8 pl-0 pr-0">
					<div class="card height-300-scroll">
						<div class="card-header">
							<div class="row">
								<div class="col-md-2 text-center m-0 p-0">
									<img src="//placehold.it/300" class="rounded-circle square-50"
										style="height: 75px; width: 75px;" />


								</div>
								<div class="col-md-10 m-0 p-0">
									<h6 class="card-title chat-title w-100"
										style="display: -webkit-inline-box">chat with user name</h6>
									<h7 class="card-text">Some quick example text to build on
									the card title and make up the bulk of the card's content.</h7>
								</div>



							</div>
						</div>
						<div class="row w-100">
							<div class="col-md-12 chat_result">
								<!-- <div class="chat-left">
									<div class="chat-bg-left m-2 p-2">
										<div class="d-flex">

											<div class="dot_green align-self-center mr-1 mt-1"></div>
											<div>online 10.20 am today</div>
										</div>
										<div class="card card-inverse card-warning mb-3 text-center">
											<div class="card-block">
												<blockquote class="card-blockquote">
													<p>Lorem ipsum dolor sit amet, consectetur adipiscing
														elit. Integer posuere erat a ante.</p>
													<footer>
														Someone famous in <cite title="Source Title">Source
															Title</cite>
													</footer>
												</blockquote>
											</div>
										</div>
									</div>

								</div>
								<div class="chat-right">
									<div class="chat-bg-right m-2 p-2">

										<div class="d-flex flex-row-reverse">


											<div class="align-items-end flex-column">online 10.20
												am today</div>
											<div class="dot_green align-self-center mr-1 mt-1 "></div>
										</div>
										<div class="card card-inverse card-primary mb-3 text-center">
											<div class="card-block">
												<blockquote class="card-blockquote">
													<p>Lorem ipsum dolor sit amet, consectetur adipiscing
														elit. Integer posuere erat a ante.</p>
													<footer>
														Someone famous in <cite title="Source Title">Source
															Title</cite>
													</footer>
												</blockquote>
											</div>
										</div>

									</div>
								</div> -->




							</div>


						</div>
					</div>

					<div class="row m-2 p-2 ">
						<div class="col-md-11">
							<textarea class="form-control" id="exampleTextarea" rows="1"></textarea>
						</div>
						<div class="col-md-1">
							<button type="button" class="btn btn-primary btn-sm chat-send"
								style="height: 40px; width: 40px; border-radius: 50%;"></button>

						</div>

					</div>

				</div>

			</div>
		</div>
	</div>

	<!-- /.container -->



</body>
</html>
