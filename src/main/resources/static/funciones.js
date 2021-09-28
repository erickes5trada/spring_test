function eliminar(id){
		swal({
	  title: "Quieres eliminar??",
	  text: "Una vez eliminado tu registro no podrás recuperarlo!",
	  icon: "warning",
	  buttons: true,
	  dangerMode: true,
	})
	.then((OK) => {
	  if (OK) {
	  $.ajax({
	  	url:"/eliminar/"+id,
	  	success :function(res){
	  		console.log(res);
	  	}
	  });
	    swal("Listo!! El usuario ha sido eliminado", {
	      icon: "success",
	    }).then((ok)=>{
	    	if(ok){
	    		location.href="/listar";
	    	}
	    });
	  } else {
	    swal("Tu registro no se ha eliminado");
	  }
	});
}

function ok(){
swal({
  title: "Listo!",
  text: "Tu registro se ha almacenado!",
  icon: "success",
  button: "Chido!",
});

}