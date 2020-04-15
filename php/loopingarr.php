<?php

$cars = array("BMW","AUDI","FERRARI","TOYATA","LAMBHORGINI","TESLA");
$len = count($cars);

for($i=0;$i<$len;$i++){
    echo $cars[$i]."\n";
}

//or
echo "\n";

foreach($cars as $brand){
    echo $brand."\n";
}


?>