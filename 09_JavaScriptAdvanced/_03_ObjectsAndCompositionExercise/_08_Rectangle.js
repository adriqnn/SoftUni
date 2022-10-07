function rectangle(w,l,c){
    let color = c.charAt(0).toUpperCase() + c.slice(1);
    const rectangle = {
        width: Number(w),
        height: Number(l),
        color: color,
        calcArea(){
            return (this.width * this.height);
        }
    }
    return rectangle;
}