<?php 
    echo "Привет " . $_GET['value'].", радвам се да те видя!";
    $redirectText = "file.php";
    echo "<br><a href={$redirectText}><< Връщане назад</a>";
?>