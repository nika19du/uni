<?php
    session_start();
    echo "<link rel='stylesheet' type='text/css' href='styles.css' />";
    $arr = array("Petar"=>"Petrov", "Ben"=>"Aflec", "Joe"=>"Biden", "Donald"=>"Trump");
    $expanded_array=[];

    if (isset($_SESSION['my_data'])) {
        $data = $_SESSION['my_data'];
        $last_name=$_SESSION['last_name'];
         
        $new_elements = array($data=>$last_name);
        $expanded_array = array_merge($arr, $new_elements);
        $new_elements=[];
        $_SESSION['arr']=$expanded_array;
    }

    if (isset($_SESSION['arr'])) {
        $arr=$_SESSION['arr'];
        echo "<div class='container'> <h2>👽Users:". "(". count($arr). ")</h2>"."<ul class='list'>";
        foreach ($arr as $key => $value) { 
                $full_name=$key." ".$value;
                echo "<li><a href='index.php?value=$full_name'>". $key." ";
                echo $value." </a></li>";
            }
        echo "</ul></div>";
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-WGtda1nDnPyuVfTwFZZ44L//VnW9x1yj++7Q2oFjv0JW6TZ+0zUhr2QKjNF5X5l6" crossorigin="anonymous">
    <link rel='stylesheet' type='text/css' href='styles.css' />
    <title>Users Control</title>
</head>
<body>
    <hr>
    <div id="form">
        <h2>Add User</h2>
        <div >
            <form action="form.php"method="POST" class="myform">
                <input for="first_name" type="text" name="firstName" placeholder="Enter first name"> 
                <input type="text" for="last_name" name="lastName" placeholder="Enter last name"> 
                <input type= "text" for="address" name="address"placeholder="Enter address">
                <input type="text" name="phone" maxlength="10" placeholder="Enter phone number">
                <input type="email" for="email" name="email" placeholder="Enter email">
                <button class="buttons" type="submit"value="Submit">Submit</button>

                <input style="color:red;" class="buttons" type="reset" name="clear"></button>
            </form>
        </div>
    </div>
</body>
</html>