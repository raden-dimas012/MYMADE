package com.dimas.made1.core.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0017\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0016\u0010\u0013\u001a\u00020\f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/dimas/made1/core/adapter/ContentTvAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dimas/made1/core/adapter/ContentTvAdapter$ContentTvViewHolder;", "()V", "listTv", "Ljava/util/ArrayList;", "Lcom/dimas/made1/core/domain/model/DataDomain;", "onItemClickCallback", "Lcom/dimas/made1/core/adapter/ContentTvAdapter$OnItemClickCallback;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "newListTv", "", "setOnItemClickCallback", "ContentTvViewHolder", "OnItemClickCallback", "core_debug"})
public final class ContentTvAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dimas.made1.core.adapter.ContentTvAdapter.ContentTvViewHolder> {
    private java.util.ArrayList<com.dimas.made1.core.domain.model.DataDomain> listTv;
    private com.dimas.made1.core.adapter.ContentTvAdapter.OnItemClickCallback onItemClickCallback;
    
    public ContentTvAdapter() {
        super();
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dimas.made1.core.domain.model.DataDomain> newListTv) {
    }
    
    public final void setOnItemClickCallback(@org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.adapter.ContentTvAdapter.OnItemClickCallback onItemClickCallback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dimas.made1.core.adapter.ContentTvAdapter.ContentTvViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.adapter.ContentTvAdapter.ContentTvViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/dimas/made1/core/adapter/ContentTvAdapter$ContentTvViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/dimas/made1/core/databinding/ItemContentBinding;", "(Lcom/dimas/made1/core/adapter/ContentTvAdapter;Lcom/dimas/made1/core/databinding/ItemContentBinding;)V", "bind", "", "tv", "Lcom/dimas/made1/core/domain/model/DataDomain;", "core_debug"})
    public final class ContentTvViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.dimas.made1.core.databinding.ItemContentBinding binding = null;
        
        public ContentTvViewHolder(@org.jetbrains.annotations.NotNull()
        com.dimas.made1.core.databinding.ItemContentBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.dimas.made1.core.domain.model.DataDomain tv) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/dimas/made1/core/adapter/ContentTvAdapter$OnItemClickCallback;", "", "onItemClicked", "", "tv", "Lcom/dimas/made1/core/domain/model/DataDomain;", "core_debug"})
    public static abstract interface OnItemClickCallback {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        com.dimas.made1.core.domain.model.DataDomain tv);
    }
}