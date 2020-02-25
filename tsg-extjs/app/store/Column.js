Ext.define('TelosysGen.store.Column', {
	extend : 'Ext.data.Store',
	alias : 'store.column',
	model : 'TelosysGen.model.Column',
	proxy : {
		type : 'rest',
		url : 'http://localhost:8080/column',
		reader : {
			type : 'json',
			rootProperty : '_embedded.column'
		},
		writer : {
			type : 'json',
			writeAllFields : true
		}
	}
});