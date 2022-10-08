import { del, get, post, put } from "./api.js";
//get all items
export async function getAllShoes(){
    return get('/data/shoes?sortBy=_createdOn%20desc');
}
//create a shoe
export async function createShoe(shoe){
    return post('/data/shoes', shoe);
}
//get shoe
export async function getShoeById(id){
    return get('/data/shoes/' + id)
}
//delete shoe
export async function deleteShoe(id){
    return del('/data/shoes/' + id)
}
//edit shoe
export async function updateShoe(id, shoe){
    return put('/data/shoes/' + id, shoe)
}
//get shoe by model
export async function getShoeByModel(query){
    return get(`/data/shoes?where=brand%20LIKE%20%22${query}%22`);
}