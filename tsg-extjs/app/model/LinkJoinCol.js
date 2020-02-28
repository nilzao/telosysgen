Ext.define('TelosysGen.model.LinkJoinCol', {
	extend : 'Ext.data.Model',
	alias : 'model.linkJoinCol',
	fields : [ {
		name : 'id',
		type : 'int'
	}, {
		name : 'insertable',
		type : 'string'
	}, {
		name : 'name',
		type : 'string'
	}, {
		name : 'nullable',
		type : 'string'
	}, {
		name : 'referencedColumnName',
		type : 'string'
	}, {
		name : 'unique',
		type : 'string'
	}, {
		name : 'updatable',
		type : 'string'
	} ],
	proxy : {
		type : 'rest',
		url : TelosysGen.Vars.baseStoreProxyUrl + '/linkJoinColumn',
		api : {
			create : TelosysGen.Vars.baseStoreProxyUrl + '/linkJoinColumn',
			update : TelosysGen.Vars.baseStoreProxyUrl + '/linkJoinColumn',
			destroy : TelosysGen.Vars.baseStoreProxyUrl + '/linkJoinColumn'
		},
		baseUrl : '/linkJoinColumn',
		reader : {
			type : 'json',
			rootProperty : '_embedded.linkJoinColumn',
			totalProperty : 'page.totalElements'
		},
		writer : {
			type : 'json',
			writeAllFields : true
		}
	}
});
