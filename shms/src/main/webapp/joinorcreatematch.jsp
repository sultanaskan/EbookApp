
<!-- Match Entry and create options -->



	<div id="joinform" style="display: block" class="main">
		<div class="banner joinorcreatematchbanner">
			<h3 >You can create new match. To create new match click on Create button >></h3>
			<button onclick="formToggle('createform', 'joinform');" class="banner-button">Create</button>
		</div>

		<div id="joininmatch" class="form-container">
			<h1 id="formheader">Select match and send Join request</h1>
			<form action="loginSertlet" id="loginForm">
				<select id="matchlist" class="matchlist">
					<option value="apple">Apple</option>
				</select> <input type="submit" value="Send Request">
			</form>
		</div>
	</div>



	<div id="createform" class="main" style="display: none;">
		<div class="banner joinorcreatematchbanner">
			<h3 id="banner-text">You can send Join request to join Others
				Match</h3>
			<button onclick="formToggle('createform' , 'joinform')" 
				class="banner-button">join</button>
		</div>


		<div id="creatematch" class="form-container">
			<h1 id="formheader">Create New Match</h1>
			<form action="loginSertlet" id="loginForm">
				<input type="text" placeholder="hostel name" autofocus="autofocus">
				<input type="text" placeholder="Hostel address"
					autofocus="autofocus"> <input type="submit" value="Next">
			</form>
		</div>
	</div>


	<script >
		
	</script>











