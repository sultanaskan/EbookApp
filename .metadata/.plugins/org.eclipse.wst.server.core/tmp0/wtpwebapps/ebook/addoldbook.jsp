<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Old Book</title>
<%@include file="components/allcss.jsp"%>
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
					<h1 class="text-center text-success">Sell Old Book</h1>
					<c:if test="${not empty baddMSG }">
					${baddMSG}
					<c:remove var="baddMSG" scope="session"/>
					</c:if>
					
					
					
						<form action="addbook" method="post"
							enctype="multipart/form-data">
							<div class="form-group">
								<label>Book Name:</label> <input name="bookname" type="text"
									class="form-control">
							</div>
							<div class="form-group">
								<label>Author Name:</label> <input name="author" type="text"
									class="form-control">
							</div>
							<div class="form-group">
								<label>Price:</label> <input name="price" type="text"
									class="form-control">
							</div>
							<div class="form-group">
								<label>Categories:</label> <select class="form-control"
									name="cat">
									<option selected>Old</option>
									
								</select>
							</div>
							<div class="form-group">
								<label>Status:</label> <select class="form-control"
									name="status">
									<option selected>Active</option>
									<option>Inactive</option>
								</select>
							</div>
							<div class="form-group ">
								<table>
									<tr>
										<td><label>Upload Book Thumbnai:</label></td>
										<td><input name="photo" type="file"></td>
									</tr>
								</table>

							</div>
							<div class="form-group form-check">
								<input name="term" type="checkbox" class="form-check-input"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">I agree with Terms and conditions !</label>
							</div>
							<button type="submit" class="btn btn-primary float-right">ADD
								BOOK</button>
						</form>
						
						
						
					</div>
				</div>
			</div>
		</div>
	</div>


	<%@include file="components/footer.jsp"%>
</body>
</html>