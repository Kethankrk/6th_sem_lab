<?php
    if($_POST){
        $id = $_POST["code"];
        $name = $_POST["name"];
        $price = $_POST["price"];

        $conn = pg_connect("host=localhost port=2345 dbname=postgres user=admin password=root");

        if($conn){
            $query = "INSERT INTO product VALUES ($id, '$name', $price)";
            $result = pg_query($conn, $query);

            if($result){
                echo "Successfully inserted";
            }
            else{
                echo "Failed to create a stock!";
            }

            $select = "SELECT * FROM product";
            $res = pg_query($conn, $select);


            while($row=pg_fetch_row($res)){
                echo "<p>$row[0], $row[1] $row[2]</p>";
            }
        }
    }

?>