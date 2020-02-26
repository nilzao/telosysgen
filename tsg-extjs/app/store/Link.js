Ext.define('TelosysGen.store.Link', {
	extend : 'Ext.data.Store',
	alias : 'store.link',
	model : 'TelosysGen.model.Link',
	pageSize : 20,
	proxy : {
		type : 'rest',
		url : 'http://localhost:8080/link',
		baseUrl : '/link',
		reader : {
			type : 'json',
			rootProperty : '_embedded.link'
		},
		writer : {
			type : 'json',
			writeAllFields : true
		}
	}
});