<html>
    <head>
        <title>Biodata</title>
    </head>
    <body>
        <h1>Enter your biodata</h1>
        <form action="" method="POST">
            <label>
                Name: 
                <input type="text" name="name" >
            </label>
            <br>
            <br>
            <label>
                Age: 
                <input type="number" name="age" >
            </label>
            <br>
            <br>
            <label>
                DOB: 
                <input type="date" name="dob" >
            </label>
            <br>
            <br>
            <label>
                Qualification: 
                <select name="qualification">
                    <option value="10th">10th</option>
                    <option value="+2">+2</option>
                    <option value="UG">UG</option>
                    <option value="PG">PG</option>
                </select>
            </label>
            <br>
            <br>
            <button>Submit</button>
        </form>
    </body>
</html>

<?php

if($_POST){
    echo $_POST["dob"];
}

?>