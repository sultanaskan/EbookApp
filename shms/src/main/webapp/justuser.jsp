<!-- Navigation Bar -->
<%@ include file="navbar.jsp"%>
<%@ include file="sidebar.jsp"%>
<!-- Content Area with Centered Buttons -->


<div id="main" class="main">

	<div class="derectionfornewuser justuser" id="derectionfornewuser">
		<h1>
			Still your are not match member you can join your match
			<button id="creatematchbtn"
				onclick="removeAllSiblingsAndLoadNewContent('main', 'joinorcreatematch.jsp');"
				class="button">Join</button>
			or you can create a new match
			<button
				onclick="removeAllSiblingsAndLoadNewContent('main', 'joinorcreatematch.jsp');"
				id="joinmatchbtn" class="button">Create</button>
		</h1>
	</div>



</div>