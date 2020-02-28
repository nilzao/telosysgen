Ext.define('TelosysGen.store.FkCol', {
	extend : 'Ext.data.Store',
	alias : 'store.fkcol',
	model : 'TelosysGen.model.FkCol',
	pageSize : 20,
	listeners : {
		beforesync : function(thisObj, eOpts) {
			this.getProxy().setUrl(TelosysGen.Vars.baseStoreProxyUrl + this.getProxy().baseUrl);
		}
	},
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