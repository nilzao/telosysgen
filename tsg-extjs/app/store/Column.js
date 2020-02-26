Ext.define('TelosysGen.store.Column', {
	extend : 'Ext.data.Store',
	alias : 'store.column',
	model : 'TelosysGen.model.Column',
	pageSize : 20,
	proxy : {
		type : 'rest',
		url : 'http://localhost:8080/column',
		baseUrl : '/column',
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