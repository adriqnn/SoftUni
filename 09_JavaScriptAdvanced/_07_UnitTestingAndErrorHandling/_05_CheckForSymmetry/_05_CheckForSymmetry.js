function check_for_symmetryV1(arr) {
    if (!Array.isArray(arr)){
        return false; // Non-arrays are non-symmetric
    }

    let reversed = arr.slice(0).reverse(); // Clone and reverse
    let equal = (JSON.stringify(arr) === JSON.stringify(reversed));

    return equal;
}

function check_for_symmetryV2(arr) {
    if (!Array.isArray(arr)){
        return false; // Non-arrays are non-symmetric
    }

    let reversed = arr.slice(0).reverse(); // Clone and reverse

    return (JSON.stringify(arr) === JSON.stringify(reversed));
}

export { check_for_symmetryV1, check_for_symmetryV2 };