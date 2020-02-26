Ext.define('TelosysGen.store.Link', {
	extend : 'Ext.data.Store',
	alias : 'store.link',
	model : 'TelosysGen.model.Link',
	pageSize : 20,
	proxy : {
		type : 'rest',
		url : TelosysGen.Vars.baseStoreProxyUrl + '/link',
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