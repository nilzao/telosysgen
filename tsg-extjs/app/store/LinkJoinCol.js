Ext.define('TelosysGen.store.LinkJoinCol', {
	extend : 'Ext.data.Store',
	alias : 'store.linkjoincol',
	model : 'TelosysGen.model.LinkJoinCol',
	pageSize : 20,
	listeners : {
		beforesync : function(thisObj, eOpts) {
			this.getProxy().setUrl(TelosysGen.Vars.baseStoreProxyUrl + this.getProxy().baseUrl);
		}
	},
	proxy : {
		type : 'rest',
		url : TelosysGen.Vars.baseStoreProxyUrl + '/linkJoinColumn',
		baseUrl : '/linkJoinColumn',
		reader : {
			type : 'json',
			rootProperty : '_embedded.linkJoinColumn'
		},
		writer : {
			type : 'json',
			writeAllFields : true
		}
	}
});