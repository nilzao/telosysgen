Ext.define('TelosysGen.store.Table', {
	extend : 'Ext.data.Store',
	alias : 'store.table',
	model : 'TelosysGen.model.Table',
	proxy : {
		type : 'rest',
		url : 'http://localhost:8080/table',
		reader : {
			type : 'json',
			rootProperty : '_embedded.table'
		}
	}
});