
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"/>
    <title>Library</title>
</head>
<body>
<?php
    session_start();
    $txt=""; 
    $errMsg="";
    $form_data = array();

    if(isset($_POST['clear'])) {
        // Clear input fields
        $_POST['first_name'] = '';
        $_POST['last_name'] = '';
        $_POST['email'] = '';
        $_POST['phone'] = '';
        $_POST['address'] = '';
    }

    if (empty($_POST["firstName"]) &&  empty($_POST["address"]) && empty($_POST["email"]) && empty($_POST["lastName"])){
        $errMsg ="Попълнете формата! <br>";
    }
    else{
    
        if(empty($_POST["firstName"])){
            $errMsg .="Не сте въвели малко име! <br>";
        }
        else if(empty($_POST["lastName"])){
            $errMsg .="Не сте въвели голямо име! <br>";
        }
        else if(empty($_POST["address"])){
            $errMsg .="Не сте въвели адрес! <br>";
        }
        else if(empty($_POST["email"])){
            $errMsg .="Не сте въвели имейл! <br>";
        }
        
    }
    if ($errMsg){
        echo "<span class='errMsg' style='color:red'>$errMsg</span>";
    } 
    else{
        $_SESSION['my_data'] = $_POST["firstName"]." ";
        $_SESSION['last_name'] = $_POST["lastName"]; 

        $txt="Позравления, " . "успешно създаден профил на " . $_POST["firstName"] . $_POST["lastName"] .
        ", адрес: " . $_POST["address"] . "!<br> очаквайте на вашия имейл " . $_POST["email"] . " повече информация.😎✔✨";
    }
    echo $txt;
    $redirectText="file.php";
    echo "<br><a href={$redirectText}>Ново въвеждане</a>"
?>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>