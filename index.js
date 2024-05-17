document.getElementById("myForm").addEventListener("submit", function(event) {
    event.preventDefault(); 
    

    var email = document.getElementById("exampleInputEmail1").value;
    var password = document.getElementById("exampleInputPassword1").value;
    var isChecked = document.getElementById("exampleCheck1").checked;

   
    var displayDiv = document.getElementById("displayData");
    displayDiv.innerHTML = "<h2>Form Data</h2>" +
                            "<p>Email: " + email + "</p>" +
                            "<p>Password: " + password + "</p>" +
                            "<p>Checkbox Checked: " + isChecked + "</p>";

    
    console.log("Email:", email);
    console.log("Password:", password);
    console.log("Checkbox Checked:", isChecked);
});
