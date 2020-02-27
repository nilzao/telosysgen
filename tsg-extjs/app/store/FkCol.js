Ext.define('TelosysGen.store.FkCol', {
	extend : 'Ext.data.Store',
	alias : 'store.fkcol',
	model : 'TelosysGen.model.FkCol',
	pageSize : 20,
	proxy : {
		type : 'rest',
		url : TelosysGen.Vars.baseStoreProxyUrl + '/fkcol',
		baseUrl : '/fkcol',
		reader : {
			type : 'json',
			rootProperty : '_embedded.fkcol'
		},
		writer : {
			type : 'json',
			writeAllFields : true
		}
	}
});