
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Library</title>
</head>
<body>
<?php
    $txt=""; 
    $errMsg="";
    if(empty($_POST["fullName"])){
        $errMsg .="Не сте въвели име! <br>";
    }
    else if(empty($_POST["address"])){
        $errMsg .="Не сте въвели адрес! <br>";
    }
    else if(empty($_POST["email"])){
        $errMsg .="Не сте въвели имейл! <br>";
    }
    else if(empty($_POST["book"])){
        $errMsg .="Не сте въвели книга! <br>";
    }  
    
    if (empty($_POST["fullName"]) &&  empty($_POST["address"]) && empty($_POST["email"]) && empty($_POST["book"])){
        $errMsg ="Попълнете формата! <br>";
    }
    
    if ($errMsg){
        echo "<span class='errMsg' style='color:red'>$errMsg</span>";
    } 
    else{
        $txt="Здравейте " . $_POST["fullName"] . "  успешна поръчка на  " . $_POST["book"] .", адрес: " . $_POST["address"] . "!<br> очаквайте на вашия имейл " . $_POST["email"] . " повече информация за доставката.";
    }

    echo $txt;
    $redirectText="index.php";
    echo "<br><a href={$redirectText}>Ново въвеждане</a>"
?>
</body>
</html>