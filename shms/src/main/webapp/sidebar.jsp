
<div id="mySidebar" class="sidebar">
	<a href="javascript:void(0)" class="closebtn" onclick="closeSidebar()">&times;</a>
	<!-- Close button -->
	<a href="#">Menu Item 1</a> <a href="#">Menu Item 2</a> <a href="#">Menu
		Item 3</a>
</div>






<script type="text/javascript">
const creatematchbtn = document.getElementById("creatematchbtn");
const joinmatchbtn = document.getElementById("joinmatchbtn");
const derectionfornewuser = document.getElementById("derectionfornewuser");
const mysidebar = document.getElementById("mySidebar");
const matchentryoptions = document.getElementById("matchentryoptions");
const sitelist = document.querySelector(".sidebar a");

/* Open sidebar */
function openSidebar() {
	mysidebar.style.width = "160px";
}


/* close sidebar*/
function closeSidebar() {
	
	mysidebar.style.width = "0";
	
}
</script>