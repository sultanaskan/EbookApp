




/* Open sidebar */
function openSidebar() {
	mysidebar.style.width = "160px";
}


/* close sidebar*/
function closeSidebar() {
	mysidebar.style.display = "flex";
	mysidebar.style.width = "0";

}







function removeAllSiblingsAndLoadNewContent(targetElementId, newContentUrl) {
	// Step 1: Select the target element by its ID
	var targetElement = document.getElementById(targetElementId);

	if (targetElement) {
		// Step 2: Remove existing siblings
		while (targetElement.firstChild) {
			targetElement.removeChild(targetElement.firstChild);
		}

		// Step 3: Load and insert new content
		fetch(newContentUrl)
			.then(response => response.text())
			.then(data => {
				targetElement.innerHTML = data;
			})
			.catch(error => {
				console.error("Error loading HTML content:", error);
			});
	} else {
		console.error("Target element not found.");
	}
}





 function formToggle(existsformId, newformId) {
            var existsform = document.getElementById(existsformId);
            var newform = document.getElementById(newformId);

            if (existsform.style.display === "block") {
                existsform.style.display = "none";
                newform.style.display = "block";
            } else {
                existsform.style.display = "block";
                newform.style.display = "none";
            }
        }
        
        
        
const setHeight = () =>{
	const currentHeight = window.innerHeight;
	document.body.style.height= '${currentHeight}px';
	console.log("heith id: ",currentHeight);
};
window.addEventListener("resize", setHeight);
setHeight();   
        