Ext.define('TelosysGen.store.Database', {
	extend : 'Ext.data.Store',
	alias : 'store.database',
	model : 'TelosysGen.model.Database',
	pageSize : 20,
	proxy : {
		type : 'rest',
		url : 'http://localhost:8080/database',
		reader : {
			type : 'json',
			rootProperty : '_embedded.database'
		},
		writer : {
			type : 'json',
			writeAllFields : true
		}
	}
});