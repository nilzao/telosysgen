Ext.define('TelosysGen.model.Fk', {
	extend : 'Ext.data.Model',
	alias : 'model.fk',
	fields : [ {
		name : 'id',
		type : 'int'
	}, {
		name : 'name',
		type : 'string'
	}, {
		name : 'fkcol',
		type : 'string'
	} ],
	proxy : {
		type : 'rest',
		url : TelosysGen.Vars.baseStoreProxyUrl + '/fk',
		api : {
			create : TelosysGen.Vars.baseStoreProxyUrl + '/fk',
			update : TelosysGen.Vars.baseStoreProxyUrl + '/fk',
			destroy : TelosysGen.Vars.baseStoreProxyUrl + '/fk'
		},
		baseUrl : '/fk',
		reader : {
			type : 'json',
			rootProperty : '_embedded.fk',
			totalProperty : 'page.totalElements'
		},
		writer : {
			type : 'json',
			writeAllFields : true
		}
	}
});
