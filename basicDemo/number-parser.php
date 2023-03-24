<?php
    $num = isset($_POST['number']) ? (int)$_POST['number']:0;
    //Create an array to store the numbers
    $numbers=[];
    if($num>0){
        $numbers[]=$num;
    }
    //Iterate through the array using a foreach loop
    $total=0;
    foreach($numbers as $number){
        $total+=$number;
    }

    //Output
    echo "<h1>Number Parser</h1>";
    echo "<ul>";
    foreach($numbers as $number){
        echo "<li>$number</li>";
    }
    echo "</ul>";
    echo "<p>The total is: $total</p>";
?>