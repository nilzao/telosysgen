Ext.define('TelosysGen.store.Fk', {
	extend : 'Ext.data.Store',
	alias : 'store.fk',
	model : 'TelosysGen.model.Fk',
	pageSize : 20,
	proxy : {
		type : 'rest',
		url : TelosysGen.Vars.baseStoreProxyUrl + '/fk',
		baseUrl : '/fk',
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