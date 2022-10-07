function solve(array){
    const odd = array.filter((x,i) => i % 2);
    //const result = array.filter((x,i) => i % 2 != 0);
    const doubled = odd.map(x => x*2);
    doubled.reverse();
    console.log(doubled.join(" "));
}