function gramophoneV1(band, album, song){
    let time = (band.length * album.length) * song.length / 2;
    let rotations = Math.ceil(time / 2.5);

    return `The plate was rotated ${rotations} times.`;
}

const gramophoneV2 = function(band, album, song){
    let time = (band.length * album.length) * song.length / 2;
    let rotations = Math.ceil(time / 2.5);

    return `The plate was rotated ${rotations} times.`;
}

const gramophoneV3 = (band, album, song) => {
    let time = (band.length * album.length) * song.length / 2;
    let rotations = Math.ceil(time / 2.5);

    return `The plate was rotated ${rotations} times.`;
}
