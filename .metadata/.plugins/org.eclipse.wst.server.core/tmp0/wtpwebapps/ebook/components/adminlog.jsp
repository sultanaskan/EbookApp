<c:if test="${logedin.role != 'admin'}">
		<c:redirect url="../login.jsp" />
	</c:if>