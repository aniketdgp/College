<?php 

function ap(){
    $x = 0;
    echo $x."\n";
    $x++;
}

function sap(){
    static $x = 0;
    echo $x."\n";
    $x++;
}

echo "Whithout static call\n";
ap();
ap();
ap();
echo "with Static call\n";
sap();
sap();
sap();

?>