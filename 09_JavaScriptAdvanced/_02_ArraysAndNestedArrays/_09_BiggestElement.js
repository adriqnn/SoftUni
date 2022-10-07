function solve(arr) {
    return arr.reduce((a, v) => (a = Math.max(...v) > a ? Math.max(...v) : a), -Infinity)
}