
let 할일목록 = [
    {할일코드 : 1 , 할일내용 : '1교시수업듣기' , 할일상태:false},
    {할일코드 : 2 , 할일내용 : '여행준비하기' , 할일상태:true }
]

let 식별번호 = 3;


function onWrite(){ console.log( 'onWrite load');
   
    let sampleBoard = {  "code" : "5" , "content" : "춘배야" ,"state":"true" }
    
    let option = {
        method : 'POST' ,
        headers : { 'Content-Type' : 'application/json'} , 
        body : JSON.stringify( sampleBoard ) 
    }

    fetch( '/write' , option )
        .then( response => response.json() )
        .then( data => { console.log( data ); })
        .catch( error => { console.log( error); } );
}  

function onprint(){ console.log( 'onprint load');
   
    fetch( '/print' )
        .then( response => response.json() )
        .then( data => console.log( data ) ) 
        .catch( error => console.log(error) );
}  



function onUpdate(){ console.log( 'onUpadte load');
   
    let sampleBoard = {"code" : 2 ,  "content" : "춘식이" ,  "state" : "true" }
    
    fetch( `/update` , { 
        method : 'PUT' ,  headers:{'Content-Type' : 'application/json'},
        body : JSON.stringify( sampleBoard ) 
    } )
        .then( r => r.json() )
        .then( d => console.log(d)  )
        .catch( e => console.log(e) );
}
function onDelete(){ console.log( 'onDelete load');
   
    let samplecode = 2;
    
    fetch( `/delete?code=${ samplecode }` , { method : 'delete' } )
        .then( r => r.json() )
        .then( d => console.log( d ) )
        .catch( e => console.log(e) );
} 




