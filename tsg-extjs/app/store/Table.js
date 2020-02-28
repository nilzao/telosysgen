Ext.define('TelosysGen.store.Table', {
	extend : 'Ext.data.Store',
	alias : 'store.table',
	model : 'TelosysGen.model.Table',
	pageSize : 20,
	listeners : {
		beforesync : function(thisObj, eOpts) {
			this.getProxy().setUrl(TelosysGen.Vars.baseStoreProxyUrl + this.getProxy().baseUrl);
		}
	},
	proxy : {
		type : 'rest',
		url : TelosysGen.Vars.baseStoreProxyUrl + '/table',
		baseUrl : '/table',
		reader : {
			type : 'json',
			rootProperty : '_embedded.table'
		},
		writer : {
			type : 'json',
			writeAllFields : true
		}
	}
});