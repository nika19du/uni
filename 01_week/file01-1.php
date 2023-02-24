
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP & MySQL</title>
</head>
<body>
<?php
    $txt=""; 
    $errMsg="";
    if(empty($_POST["firstName"])){
        $errMsg .="Не сте въвели име! <br>";
    }
    if(empty($_POST["subject"])){
        $errMsg .="Не сте въвели име! <br>";
    }
    else{
        $txt.="Здравейте " . $_POST["firstName"] . " ". $_POST["lastName"] ." " . $_POST["spec"] . "!<br>";
        $subject=$_POST["subject"];
        $txt .= "Вие избрахте <ul>";
        for( $i = 0; $i < count($subject); $i++){
            $txt .= "<li>" . $subject[$i] . "</li>";
        }
        $txt .= "</ul>";

    }

    echo $txt;
    $redirectText="1_week.php";
   echo "<br><a href={$redirectText}>Ново въвеждане</a>"
?>
</body>
</html>