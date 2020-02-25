Ext.define('TelosysGen.model.Link', {
    extend: 'Ext.data.Model',
    alias : 'model.link',
    fields: [
        { name: 'id', type: 'int' },
        { name: 'cardinalityTg', type: 'string' },
        { name: 'foreignKeyName', type: 'string' },
        { name: 'idDb', type: 'string' },
        { name: 'inverseSideOf', type: 'string' },
        { name: 'javaName', type: 'string' },
        { name: 'javaType', type: 'string' },
        { name: 'joinTableName', type: 'string' },
        { name: 'mappedBy', type: 'string' },
        { name: 'optional', type: 'string' },
        { name: 'owningSide', type: 'string' },
        { name: 'sourceTableName', type: 'string' },
        { name: 'targetEntity', type: 'string' },
        { name: 'targetTableName', type: 'string' },
        { name: 'used', type: 'string' },
        { name: 'cascade', type: 'string' },
        { name: 'fetch', type: 'string' }
    ]
});
