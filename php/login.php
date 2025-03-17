<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <h1>LOGIN</h1>
        <form action="" method="POST">
            <label>
                Username: <input type="text" name="username">
            </label>
            <label>
                Password: <input type="passwrod" name="password">
            </label>
            <button type="submit">SUBMIT</button>
        </form>
    </body>
</html>

<?php
if($_POST){
    $username = $_POST["username"];
    $password = $_POST["password"];

    $conn = pg_connect("host=localhost port=2345 dbname=postgres user=admin password=root");

    if($conn){
        echo "<p>DB connection successful</p>";
        $query = "SELECT * FROM login WHERE username='$username' and password='$password'";

        $result = pg_query($conn, $query);

        if($result){
            echo "Login success";
        }
        else{
            echo "Login failed!";
        }
    }
    else{
        echo "DB connection failed!";
    }
}


?>