function rectangleV1(width, height, color){
    return {
        width: width,
        height: height,
        color: color[0].toUpperCase() + color.slice(1, color.length),
        calcArea() {
            return this.width * this.height
        }
    }
}

function rectangleV2(width, height, color){
    class Rectangle{
        constructor(width, height, color){
            this.width = width;
            this.height = height;
            this.color = color[0].toUpperCase + color.slice(1);
        }

        calcArea(){
            return this.height * this.width;
        }
    }

    return new Rectangle(width, height, color);
}

function rectangleV3(w, h, c){
    let color = c.charAt(0).toUpperCase() + c.slice(1);
    const rectangle = {
        width: Number(w),
        height: Number(h),
        color: color,
        calcArea(){
            return (this.width * this.height);
        }
    }

    return rectangle;
}

function rectangleV4(w, h, c){
    let color = c.charAt(0).toUpperCase() + c.slice(1);

    return {
        width: Number(w),
        height: Number(h),
        color: color,
        calcArea() {
            return (this.width * this.height);
        }
    };
}
