<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Форма за въвеждане на данни</title>
  </head>
  <body>
    <form method="get" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
      <?php
      for ($i = 1; $i <= 8; $i++) {
		echo "<label>Име на стока $i:</label>";
		$name = isset($_GET["name$i"]) ? $_GET["name$i"] : "";
		echo "<input type='text' name='name$i' value='".htmlspecialchars($name)."' required>";
		
		echo "<label>Цена на стока $i:</label>";
		$price = isset($_GET["price$i"]) ? $_GET["price$i"] : "";
		echo "<input type='number' name='price$i' step='0.01' value='".htmlspecialchars($price)."' required>";
	  }
      ?>
      <input type="submit" value="Изпрати">
    </form>
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "GET") {
      // Въведените данни
      $data = array();
      for ($i = 1; $i <= 8; $i++) {
		$name = isset($_GET["name$i"]) ? $_GET["name$i"] : "";
		$price = isset($_GET["price$i"]) ? $_GET["price$i"] : "";
        $data[] = array("name" => $name, "price" => $price);
      }
      // Списък на въведените данни
      echo "<h2>Списък на въведените данни:</h2>";
      echo "<ul>";
      foreach ($data as $item) {
        echo "<li>".$item["name"].": ".$item["price"]." лв.</li>";
      }
      echo "</ul>";
      // Средна цена на стоките
      $total = 0;
      foreach ($data as $item) {
        $total += (int)$item["price"];
      }
      $average = $total / count($data);
      echo "<h2>Средна цена на стоките: ".$average." лв.</h2>";
      // Списък на стоките с цена, по-ниска от средната цена
      echo "<h2>Списък на стоките с цена, по-ниска от средната цена:</h2>";
      echo "<ul>";
      foreach ($data as $item) {
        if ($item["price"] < $average) {
          echo "<li>".$item["name"].": ".$item["price"]." лв.</li>";
        }
      }
      echo "</ul>";
    }
    ?>
  </body>
</html>