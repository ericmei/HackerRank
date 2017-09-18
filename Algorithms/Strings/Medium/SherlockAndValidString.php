<?php
$_fp = fopen("php://stdin", "r");
fscanf($_fp, "%s", $str);
$arr = str_split($str);
$countValues = array_count_values($arr);
if (count(array_unique($countValues)) !== 1) {
    $keys = array_keys($countValues);
    $first = $countValues[$keys[0]];
    $keysToRemove = array();
    foreach($countValues as $key => $value) {
        if($value !== $first){
            $keysToRemove[] = $key;
        }
    }
    if (count($keysToRemove) > 1) {
        echo "NO";
    }

    else {
        echo "YES";
    }
}

else {
    echo "YES";
}
?>
