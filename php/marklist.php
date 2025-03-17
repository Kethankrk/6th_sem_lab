<html>
    <head><title>Marklist</title></head>
    <body>
        <h1>Find marklist</h1>
        <form method="POST">
            <label>
                Reg No: <input type="number" name="regno">
            </label>
            <button>FIND</button>
        </form>
    </body>
</html>

<?php

if($_POST){
    $regno = $_POST["regno"];

    // need to change the connection url
    $conn = pg_connect("host=localhost dbname=postgres port=2345 user=admin password=root");

    if($conn){
        $query = "SELECT * FROM marklist WHERE rollno=$regno";

        $result = pg_query($conn, $query);

        if(!pg_num_rows($result)){
            echo "No student found for the given regno!";
        }

        while($row=pg_fetch_row($result)){
            echo "
            <p>Reg no: $row[0]</p>
            <p>Name: $row[1]</p>
            <p>Mark: $row[2]</p>
            <p>Grade: $row[3]</p>
            ";
        }
    }
}

?>