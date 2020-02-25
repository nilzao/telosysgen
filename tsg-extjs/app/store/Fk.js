Ext.define('TelosysGen.store.Fk', {
	extend : 'Ext.data.Store',
	alias : 'store.fk',
	model : 'TelosysGen.model.Fk',
	proxy : {
		type : 'rest',
		url : 'http://localhost:8080/fk',
		reader : {
			type : 'json',
			rootProperty : '_embedded.fk'
		},
		writer : {
			type : 'json',
			writeAllFields : true
		}
	}
});