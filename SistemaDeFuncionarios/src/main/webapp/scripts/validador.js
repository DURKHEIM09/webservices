/**
 * Validaçao de formulário
 */
 
 function validar() {
	let nome = frmContato.nome.value
	let ra = frmContato.ra.value
	if (nome=== "") {
		alert("Preencha o campo Nome")
		frmContato.nome.focus()
		return false
	} else if (ra === "") {
		alert("Preencha o campo ra")
		frmContato.ra.focus()
		return false
	} else {
		document.forms["frmContato"].submit()
	}
}