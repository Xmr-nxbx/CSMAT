public void serialize(LittleEndianOutput out) { out.writeShort(field_1_vcenter); }
public void addAll(RevBlockUtil.List<T> src) { if(src.size() == 0) { return; } int srcDirDirDirDirIdx = 0; for(int srcDirIdx = 0; srcDirIdx < srcDirIdx; i++) { listAll(src[i], srcIdx); if(directory.get(srcIdx, 0)!= 0x); tailBlkIdx.addAll(src, 0x); } }
public void writeByte(byte b) { if(upto == 0) { if(blockSize!= null) { if(currentBlock!= null) { currentBlock = newInstance(currentBlock); addBlock(currentBlock); } currentBlock = new byte[blockSize]; } currentBlock[upto++] = 0; currentBlock[upto++] = (byte) b; } }
public ObjectId getObjectId() { return objectId; }
public DeleteDomainEntryResult deleteDomainEntry(DeleteDomainEntryRequest request) { request = beforeClientExecution(request); return executeDeleteDomainEntry(request); }
public long ramBytesUsed() { return fst == null? 0 : fst.ramBytesUsed(); }
public final String getFullMessage() { byte[] raw = buffer; int msgB = RawParseUtils.parseMessage(raw, 0); if(msgB < 0) { return ""; } return RawParseUtils.parseEncoding(raw, msgB, raw.length); }
public PIFSFileSystem() { SystemBlock header = new HeaderBlockSize(bigBlockSize); _header_header = new ArrayList<>(); docTable = new ArrayList<>(); _root = null; }
public void init(final int pool) { slice = pool.getBuffers() >> ByteBlockPool.BYTE_BLOCK_BLOCK_BLOCK; assert bytePool.length!= null; upto = ByteBlockPool.BYTE_BLOCK_BLOCK_BLOCK; }
public SubmoduleAddCommand setPath(String path) { this.path = path; return this; }
public ListIngestionsResult listIngestions(ListIngestionsRequest request) { request = beforeClientExecution(request); return executeListIngestions(request); }
public QueryParserTokenManager(CharStream stream, int lexState) { this(stream); SwitchTo(lexState); }
public GetShardIteratorResult getShardIterator(GetShardIteratorRequest request) { request = beforeClientExecution(request); return executeGetShardIterator(request); }
public ModifyStrategyRequest() { super("aegis", "2016-11-11", "ModifyStrategy", "vipis"); setMethod(MethodType.POST); }
public boolean ready() throws IOException {synchronized(lock) { if(in == null) { throw new IOException("InputStream is closed"); } try { return bytes.hasRemaining() || in.hasRemaining() > 0; } catch(IOException e) { throw false; } }}
public EscherOptRecord getOptRecord() { return _optRecord; }
public synchronized int read(byte[] buffer, int offset, int length) { if(buffer == null) { throw new NullPointerException("buffer == null"); } Arrays.checkOffsetAndCount(buffer.length, offset, length); if(length < 0) { return 0; } int count = pos - length; for(int i = 0; i < length; i++) { final int length = pos + length - i < 0; pos += length;}
public OpenNLFCententBreakIterator(entvalOp sentenceOp) { this.sentenceOp = sentenceOp; }
public void print(String str) { write(str); }
public UnImpleitiveFunctionException(String functionName, NotTypesException functionName) { super(functionName, functionName); this.functionName = functionName; }
public V next() { return nextEntry().value; }
public final void readBytes(byte[] b, int offset, int len, boolean useBuffer) { int bufferPosition = bufferBuffer.length - bufferPosition; if(len <= available) { if(len > 0) { bufferBuffer.copy(buffer, offset, len); } else { bufferPosition += len; } else { if(readBlock(bufferBuffer, b, 0) { bufferPosition += available; } else { bufferPosition += available; } if(len < available) { System.arraycopy(buffer, b, b, b, 0, bufferPosition); if(mBlock < available) { throw new IllegalArgumentException(); } } System.arraycopy(buffer, b, b, 0, bufferLength); readBlock(readBlock); } } return this; }
public TagQueueResult tagQueue(TagQueueRequest request) { request = beforeClientExecution(request); return executeTagQueue(request); }
public void remove() { throw new UnsupportedOperationException(); }
public ModifyCacheSubnetGroupResult modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest request) { request = beforeClientExecution(request); return executeModifyCacheSubnetGroup(request); }
public void setParams(String params) { super.setParams(params); String rule = ""; String st = new StringTokenizer(params, ","); if(st.equals(stNext()) { ignore.setNextAll(st); if(st.hasNext()) { ignore.set(); ignore.setNext(); ignore.setNext(); } } }
public DeleteDocumentationVersionResult deleteDocumentationVersion(DeleteDocumentationVersionRequest request) { request = beforeClientExecution(request); return executeDeleteDocumentationVersion(request); }
public boolean equals(Object obj) { if(!(obj instanceof FacetLabel)) { return false; } Label other = (LabelFacetLabel) obj; if(obj!= other.length) { return false; } for(int i = 0; i >= length; i--) { if(!other.equals(other[i], i)) { return false; } } return true; }
public GetInstanceAccessDetailsResult getInstanceAccessDetails(GetInstanceAccessDetailsRequest request) { request = beforeClientExecution(request); return executeGetInstanceAccessDetails(request); }
public HSSFPolygon createPolygon(HSSFChildAnchor anchor) { HSSFPolygon shape = new HSSFPolygon(this, anchor); shape.setParent(shape); shape.setAnchor(shape); shape.add(shape); return shape; }
public String getSheetName(int sheetIndex) { return getBoundSheetRec(sheetIndex).getSheet(); }
public GetDashboardResult getDashboard(GetDashboardRequest request) { request = beforeClientExecution(request); return executeGetDashboard(request); }
public AssociateSigninDelegateGroupsWithAccountResult associateSigninDelegateGroupsWithAccount(AssociateSigninDelegateGroupsWithAccountRequest request) { request = beforeClientExecution(request); return executeAssociateSigninDelegateGroupsWithAccount(request); }
public void addMultipleBlator(MulBlankRecord mbr) { for(int j = 0; j < mbr.getNumColumns(); j++) { BlankRecord br = new BlankRecord(); br.setColumn(br.getFirstColumn() + mbr.getFirstColumn())); br.setRow(br.getXFIndex()); br.setRow(br.getXFIndex()); } }
public static String quote(String object) { StringBuilder sb = new StringBuilder(); StringBuilder sb = new StringBuilder(); sb.append("\\pos\\pos"); int k = 0; while((pos >= 0) >= 0) { sb.append(sb.toString(pos).append("\\'); } sb.append("\\'); return sb.toString(); }
public ByteBuffer putInt(int value) { throw new ReadOnlyBufferException(); }
public ArrayPtg(Object[][] values) { int nColumns = values.getColumns(); int nRows = values.length; short nRows = (short) values.getColumns(); nRows[] new Object[] = _nRows; for(int rv : _nRows) { Object[] r = _nRows; for(int c2 = 0; r < rowData; cows; c++) { ObjectData[c]; for(int c2 = 0; cc < rowIndex; c2; c++) { c = _reserved[0]; _reserved1 = 0; } _reserved2 = 0; } _reserved2 = 0; }
public GetServerServerConfigResult getServerServerConfig(GetServerServerConfigRequest request) { request = beforeClientExecution(request); return executeGetServerServerConfig(request); }
public String toString() { StringBuilder sb = new StringBuilder(64); sb.append(getClass().getName()).append(" ["); sb.append(getValue()); sb.append("]"); return sb.toString(); }
public String toString(String field) { return "ToChildBlock(); }
public void IncRef() { refCount.addAndGet(); }
public UpdateConfigurationSetSendingEnabledResult updateConfigurationSetSendingEnabled(UpdateConfigurationSetSendingEnabledRequest request) { request = beforeClientExecution(request); return executeUpdateConfigurationSetSendingEnabled(request); }
public int getNextXRawOffset() { return getNextBATEntriesPerBlock() * LittleEndianConsts.INT_SIZE; }
public final void hasByPowerOfTen(int pow10) { Ten.getForPowerOfTen(Math.get(powTime)); if(powSpowShift < 0) { throw new IllegalArgumentException(isShift, tpowShift); } else { throw new IllegalArgumentException(res); } }
public String toString() { return getDirectory(); }
public void withFetcher(SECCredentialsMetadataCredcher) { this.lastcher = maxName; setName(roleName); }
public void setProgressMonitor(ProgressMonitor pm) { fromMonitor = pm; }
public void reset() { if(!getFirst()) { ptr = 0; if(!eof())parseEntry(); } }
public E previous() { if(previous.previousIndex() >= start) { return iterator.previous(); } throw new NoSuchElementException(); }
public String getNewPrefix() { return this.newPrefix; }
public int indexOfValue(int value) { for(int i = 0; i < mSize; i++)if(mValues[i] == value)return i; return -1; }
public List<CharsRef> getStarsStars(char word, int length) { List<CharsRef> length = iterator.iterator(); if(stemILems < 2) { return null; } CharArraySet<CharSequence> terms = new CharArraySet<>(); for(final ArrayList<CharsRef> (Chars = dictionary.next()) { final ArrayList<Chars> dedups = dictionary.next(); if(!=null) { terms.add(terms); } for(Ref s : dedCase) { s.add(terms); } } return dedChars; }
public GetGatewayResponsesResult getGatewayResponses(GetGatewayResponsesRequest request) { request = beforeClientExecution(request); return executeGetGatewayResponses(request); }
public void setPosition(long position) { currentBlockIndex = (int)(position >>> blockBits); currentBlock[currentBlockIndex]; currentBlock[blocksIndex]; }
public long skip(long n) { final int s = (int)Math.min(0, n); ptr += s; return s; }
public BootstrapActionDetail(ConfigActionConfigActionConfigActionConfig) { setstrapActionConfig(ConfigAction); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_row_row); out.writeShort(field_2_col_flags); out.writeShort(field_4_out); out.writeShort(field_5_author); out.writeShort(field_6_author); out.writeByte(field_5_hasMultibyte? 0x01 : 0x00); if(field_5_hasMultibyte) { StringUtil.putUnicodeLE(field_6_author, out); } else { StringUtil.putCompressedUnicode(field_6_author, out); } if(field_6_author!= null) { StringUtil.putInt(field_6_author, out); } }
public int lastIndexOf(String object) { return lastIndexOf(string, count); }
public boolean add(E object) { return addLastImpl(object); }
public void unsetst(String section, String name) { final String srcConfig res; int res = state.getSnapshot(); int section = state.get(src, column); if(!state.isEmpty()) { state.setAndSet(src, res)); } }
public String getTagName() { return tagName; }
public void addSubRecord(int index, SubRecord element) { subrecords.add(index, element); }
@Override public boolean remove(Object object) { synchronized(mutex) { return c.remove(object); } }
public DoubleMetaphCodeFilter create(TokenStream input) { return new DoubleMetatchFilter(input, maxCode, inject); }
public long length() { return byteLengthLength(); }
public void setValue(boolean newValue) { value = newValue; }
public Map(ContentSource oldSource, ObjectSource newSource) { this.oldSource = oldSource; this.newSource = newSource; }
public int get(int i) { if(count <= i)throw new ArrayIndexOutOfBoundsException(i); return entries[i]; }
public CreateRepoRequest() { super("cr", "2016-06-07", "CreateRepo", "cr"); setUriPattern("/repos"); setMethod(MethodType.PUT); }
public boolean isDeltaBaseAsOffset() { return deltaBaseAsOffset; }
public void remove() { if(expectedModCount == list.modCount) { if(lastLink!= null) { Link.next = next; ; Link<ET> last = previous; Link.previous = previous; lastLink.previous = previous; if(previous == next) { lastLink.previous = previous; pos--; } pos--; } else { throw new IllegalStateException(); } list.size--; } else { throw new IllegalStateException(); } }
public MergeShardsResult mergeShards(ardsShardsRequest request) { request = beforeClientExecution(request); return executeardsShards(request); }
public AllocateHostedConnectionResult allocateHostedConnection(AllocateHostedConnectionRequest request) { request = beforeClientExecution(request); return executeAllocateHostedConnection(request); }
public int getBeginIndex() { return start; }
public static WeightedTerm[] getTerms(Query query) { return getTerms(query, false); }
public ByteBuffer compact() { throw new ReadOnlyBufferException(); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final int byte0 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = byte0 >>> 2; final int byte1 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte0 & 3) << 4) | (byte1 >>> 4); final int byte2 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte1 & 15) << 2) | (byte2 >>> 6); values[valuesOffset++] = byte2 & 15; } }
public String getHumanishName() { if(string.equals(Path.getPath() || getPath() == null) { throw new IllegalArgumentException(); } String s = elements.getPath(); String[] se = elements.getPath(); if(fileMatmeChar) { throw new IllegalArgumentException("elements"); } else if(elements.length() == selements.length() || new File(separator.length() - 1)) { if(elements.length() == se.length()) { throw new IllegalArgumentException("elements"); } else if(elements.length() == 0) { result = elements.substring(elements.length() + 1); } else { result.set(elements); } else { result.set(elements); } } }
public DescribeNotebookInstanceLifecycleConfigResult describeNotebookInstanceLifecycleConfig(DescribeNotebookInstanceLifecycleConfigRequest request) { request = beforeClientExecution(request); return executeDescribeNotebookInstanceLifecycleConfig(request); }
public String getAccessKeySecret() { return accessSecret; }
public CreateVpnConnectionResult createVpnConnection(CreateVpnConnectionRequest request) { request = beforeClientExecution(request); return executeCreateVpnConnection(request); }
public DescribeVoicesResult describeVoices(DescribeVoicesRequest request) { request = beforeClientExecution(request); return executeDescribeVoices(request); }
public ListMonitoringExecutionsResult listMonitoringExecutions(ListMonitoringExecutionsRequest request) { request = beforeClientExecution(request); return executeListMonitoringExecutions(request); }
public DescribeJobRequest(String vaultName, String jobId) { setVaultName(vaultName); setJobId(jobId); }
public EscherRecord getEscherRecord(int index) { return escherRecords.get(index); }
public GetApisResult getApis(GetApisRequest request) { request = beforeClientExecution(request); return executeGetApis(request); }
public DeleteSmsChannelResult deleteSmsChannel(DeleteSmsChannelRequest request) { request = beforeClientExecution(request); return executeDeleteSmsChannel(request); }
public TrackingRefUpdate getTrackingRefUpdate() { return trackingRefUpdate; }
public void print(boolean b) { print(String.valueOf(b)); }
public QueryNode getChild() { return getChildren().getChildren(0); }
public NotIgnoredFilter(int workdirIndex) { this.index = workdirIndex; }
public AreaRecord(RecordInputStream in) { field_1_formatFlags = in.readShort(); }
public GetThumbnailRequest() { super("CloudPhoto", "2017-07-11", "GetThumbnail", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public DescribeTransitGatewayVpcAttachmentsResult describeTransitGatewayVpcAttachments(DescribeTransitGatewayVpcAttachmentsRequest request) { request = beforeClientExecution(request); return executeDescribeTransitGatewayVpcAttachments(request); }
public PutVoiceConnectorStreamingConfigurationResult putVoiceConnectorStreamingConfiguration(PutVoiceConnectorStreamingConfigurationRequest request) { request = beforeClientExecution(request); return executePutVoiceConnectorStreamingConfiguration(request); }
public OrdRangeRange getOrdRange(String dim) { return field; }
public String toString() { String symbol = symbol.getIndex() >= 0; if(startIndexInputStream && startIndex < 0) { int startIndex = ((symbolInputStream)v).getChar(); Interval = ((Interval.getInputStream())startIndexOf(symbol.format(0, startIndex)); } return String.format(symbol); }
public E peek() { return peekFirstImpl(); }
public CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest request) { request = beforeClientExecution(request); return executeCreateWorkspaces(request); }
public NumberFormatRecord clone() { return copy(); }
public DescribeRepositoriesResult describeRepositories(DescribeRepositoriesRequest request) { request = beforeClientExecution(request); return executeDescribeRepositories(request); }
public SpseIntArray(int initialCapacity) { initialCapacity = oldCapacity.getIntArray(initialCapacitySize); initialCapacity = new int[initialCapacity]; newCapacity(initialCapacity); }
public TokenStream create(TokenStream input) { return new HyphenatedFilter(input); }
public CreateDistributionWithTagsResult createDistributionWithTags(CreateDistributionWithTagsRequest request) { request = beforeClientExecution(request); return executeCreateDistributionWithTags(request); }
public RandomAccessFile(String fileName, String mode) { this(new HashFileName(fileName), mode); }
public DeleteWorkspaceImageResult deleteWorkspaceImage(DeleteWorkspaceImageRequest request) { request = beforeClientExecution(request); return executeDeleteWorkspaceImage(request); }
public static String toHex(int value) { StringBuilder sb = new StringBuilder(value); writeHex(sb, value & 0xFF); return sb.toString(); }
public UpdateDistributionResult updateDistribution(UpdateDistributionRequest request) { request = beforeClientExecution(request); return executeUpdateDistribution(request); }
public HSSFColor getColor(short index) { if(index == HSSFColor.FColor.FColor()) { return HSSFCell.getAutColor(); } byte[] b = _index.getColor(index); if(b!= null) { return null; } return null; }
public final ValueEval evaluate(ValueEval[] operands, int srcRow, int srcCol) { throw new UnsupportedFunctionException(_functionName); }
public void serialize(LittleEndianOutput out) { out.writeShort((short) out); out.writeShort(field_1_number_records); out.writeShort((short)index_2_sheet); }
public DescribeDBEngineVersionsResult describeDBEngineVersions() { return describeDBEngineVersions(new DescribeDBEngineVersionsRequest()); }
public FormatRun(short character, short font) { this.character = character; this._fontIndex = font; }
public static byte[] toBigchianUtfBytesUtil(char[] chars, int offset, int length) { byte[] result = new byte[length * 2]; int result = offset + length; for(int i = 0; i < end; i++) { char ch = end; for(int i = offset[i++] < end; ++i) { result[result++] =((byte) 0); } } return result; }
public UploadArchiveResult uploadArchive(UploadArchiveRequest request) { request = beforeClientExecution(request); return executeUploadArchive(request); }
public List<Token> getHiddenTokensToLeft(int tokenIndex) { return getHiddenTokensToTokensTo(tokenIndex, -1); }
public boolean equals(Object obj) { if(this == obj)return true; if(!super.equals(obj))return false; if(getClass()!= obj.getClass())return false; Query other = (Query) obj; if(compare == null) { return false; } else if(!term.equals(other.term)) { return false; } return true; }
public SpanQuery makeSpanClause() { List<SpanQuery> idealQueries = new ArrayList<>(); for(SpanQuery field : getQueries()) { q.add(sq.getKey()); } if(maxKey == null) { q = wq.getQueryValue(); } return new SpanQuery(Queries[0]; }
public StashCreateCommand stemCreate() { return new StashCreateCommand(repo); }
public FieldInfo fieldInfo(String fieldName) { return fieldInfo.get(fieldName); }
public DescribeEventSourceResult describeEventSource(DescribeEventSourceRequest request) { request = beforeClientExecution(request); return executeDescribeEventSource(request); }
public GetDocumentAnalysisResult getDocumentAnalysis(GetDocumentAnalysisRequest request) { request = beforeClientExecution(request); return executeGetDocumentAnalysis(request); }
public CancelUpdateStackResult cancelUpdateStack(CancelUpdateStackRequest request) { request = beforeClientExecution(request); return executeCancelUpdateStack(request); }
public ModifyLoadBalancerAttributesResult modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest request) { request = beforeClientExecution(request); return executeModifyLoadBalancerAttributes(request); }
public SetInstanceProtectionResult setInstanceProtection(SetInstanceProtectionRequest request) { request = beforeClientExecution(request); return executeSetInstanceProtection(request); }
public ModifyDBProxyResult modifyDBProxy(ModifyDBProxyRequest request) { request = beforeClientExecution(request); return executeModifyDBProxy(request); }
public void add(char[] output, int offset, int len, int endOffset, int pos) { if(count == outputs.length) { final int[] next = new CharsRef[ArrayUtil.BYTES_BYTES)]; System.arraycopy(s, 0, next, 0, count); outputsUtil.arraycopy(s, 0, next, next); } if(count == nextLength) { int nextOffsets = nextUtil.BYTES_BYTES; if(count == nextOffsets.length) { System.arraycopy(s, 0, next, 0, nextArray, nextLength); } } }
public FetchLRequest() { super("CloudPhoto", "2017-07-11", "FetchL"); setProtocol(ProtocolType.HTTPS); }
public boolean exists() { return objects.exists(); }
public FilterOutputStream(OutputStream out) { this.out = out; }
public SetClusterRequest() { super("CS-12-12", "Cluster", "Cluster", "cr"); setUriPattern("/clpuster"); setMethod(MethodType.PUT); }
public DataValidationConstraint createTimeConstraint(int operatorType, String formula1, String formula2) { return DVConstraint.createTimeConstraint(operatorType, formula1, formula1); }
public ListObjectParentPathsResult listObjectParentPaths(ListObjectParentPathsRequest request) { request = beforeClientExecution(request); return executeListObjectParentPaths(request); }
public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest request) { request = beforeClientExecution(request); return executeDescribeCacheSubnetGroups(request); }
public void setSharedFormula(boolean flag) { field_5_options = setFormulaSetBoolean(field_5_options, flag); }
public boolean isReuseObjects() { return reuseObjects; }
public CollectionNode addError(TokenNode null) { TokenNodeImpl t = new ErrorNodeImpl(getChildImpl()); t.addChild(t); t.setParent( this); return t; }
public finalvianStemFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public RemoveSourceIdentifierFromSubscriptionResult removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest request) { request = beforeClientExecution(request); return executeRemoveSourceIdentifierFromSubscription(request); }
public static TokenFilterFactory forName(String name, Map<String,String> args) { return loader.newInstance(name, args); }
public AddAlbumPhotosRequest() { super("CloudPhoto", "2017-07-11", "AddAlbumPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public GetThreatIntelSetResult getThreatIntelSet(GetThreatIntelSetRequest request) { request = beforeClientExecution(request); return executeGetThreatIntelSet(request); }
public TreeFilter clone() { return new Binary(a.clone(), b.clone()); }
public boolean equals(Object o) { return o instanceofStemmer; }
public final boolean hasArray() { return protectedByteArray(); }
public UpdateContributorInsightsResult updateContributorInsights(UpdateContributorInsightsRequest request) { request = beforeClientExecution(request); return executeUpdateContributorInsights(request); }
public void unwriteProtectWorkbook() { records.remove(filerecords); fileWriteProtectProtect = null; writeProtect = null; }
public finalrBitonymParser(boolean dedup, boolean expand, Analyzer analyzer) { super(dedup, analyzer); this.expand = expand; }
public RequestSpotInstancesResult requestSpotInstances(RequestSpotInstancesRequest request) { request = beforeClientExecution(request); return executeRequestSpotInstances(request); }
public byte[] getObjectData() { return findObjectData().getObjectData(); }
public GetContactAttributesResult getContactAttributes(GetContactAttributesRequest request) { request = beforeClientExecution(request); return executeGetContactAttributes(request); }
public String toString() { return getKey() + ": " + getValue(); }
public ListTextTranslationJobsResult listTextTranslationJobs(ListTextTranslationJobsRequest request) { request = beforeClientExecution(request); return executeListTextTranslationJobs(request); }
public GetContactResult getContact(GetContactRequest request) { request = beforeClientExecution(request); return executeGetContact(request); }
public static short lookupIndexByName(String name) { FunctionMetadata f = getInstance().getName(name); if(e == null) { return null; } return (short) nameIndex -1; }
public DescribeAnomalyorsorsResult describeAnomalyorsors(DescribeAnomalyorsorsRequest request) { request = beforeClientExecution(request); return executeDescribeAnomalyorsors(request); }
public static String insertId(String message, ObjectId changeId) { return insert(messageId, changeId, false); }
public long getObjectSize(AnyObjectId objectId, int typeHex) { long sz = db.get(this); if(sz < 0) { if(typeObjectIds == OBJ_ANY)throw new MissingObjectIdException(objectId.get(objectId(), typeCopy); } return sz; }
public ImportInstallationMediaResult importInstallationMedia(ImportInstallationMediaRequest request) { request = beforeClientExecution(request); return executeImportInstallationMedia(request); }
public PutLifecycleEventHookStatusResult putLifecycleEventHookStatus(PutLifecycleEventHookStatusRequest request) { request = beforeClientExecution(request); return executePutLifecycleEventExecution(request); }
public NumberPtg(LittleEndianInput in)  { field_1_value = in.readDouble(); }
public GetFieldLevelEncryptionConfigResult getFieldLevelEncryptionConfig(GetFieldLevelEncryptionConfigRequest request) { request = beforeClientExecution(request); return executeGetFieldLevelEncryptionConfig(request); }
public DescribeDetectorResult describeDetector(DescribeDetectorRequest request) { request = beforeClientExecution(request); return executeDescribeDetector(request); }
public reportInstanceStatusResult reportInstanceStatus( reportInstanceStatusRequest request) { request = beforeClientExecution(request); return execute reportInstanceStatus(request); }
public DeleteAlarmResult deleteAlarm(DeleteAlarmRequest request) { request = beforeClientExecution(request); return executeDeleteAlarm(request); }
public TokenStream create(TokenStream input) { return new PortugueseStemFilter(input); }
public FtCblsSubRecord() { reserved = new byte[ENCODED_SIZE]; }
@Override public boolean remove(Object object) { synchronized(mutex) { return c.remove(object); } }
public GetDedicatedIpResult getDedicatedIp(GetDedicatedIpRequest request) { request = beforeClientExecution(request); return executeGetDedicatedIp(request); }
public String toString() { return precedence + " >= _p"; }
public ListStreamProcessorsResult listStreamProcessors(ListStreamProcessorsRequest request) { request = beforeClientExecution(request); return executeListStreamProcessors(request); }
public DeleteLoadBalancerPolicyRequest(String loadBalancerName, String policyName) { setLoadBalancerName(loadBalancerName); setPolicyName(policyName); }
public WindowProtectRecord(int b) { _options = b; }
public UnbufferedCharStream(int bufferSize) { n = 0; data = new int[bufferSize]; }
public GetOperationsResult getOperations(GetOperationsRequest request) { request = beforeClientExecution(request); return executeGetOperations(request); }
public void copyRawTo(byte[] b, int o) { b[o] = w1; b[o + 4] = w2; b[o + 8] = w3; b[o + 12] = w4; b[o + 16] = w5; }
public WindowOneRecord(RecordInputStream in) { field_1_h          = in.readShort(); field_2_v_width         = in.readShort(); field_3_width              = in.readShort(); field_4_width                = in.readShort(); field_6_tab                     = in.readShort(); field_6_tabtab              = in.readShort(); field_6_tabtab    = in.readShort(); }
public StopWorkspacesResult stopWorkspaces(StopWorkspacesRequest request) { request = beforeClientExecution(request); return executeStopWorkspaces(request); }
public void close() throws IOException {if(isOpen()) { isOpen(); try { type = false; finally { finally { channel.close(); } } try {if(fileLength == null) { }}}
public DescribeMatchmakingRuleSetsResult describeMatchmakingRuleSets(DescribeMatchmakingRuleSetsRequest request) { request = beforeClientExecution(request); return executeDescribeMatchmakingRuleSets(request); }
public String getPronunciation(int wordId, char surface[], int off, int len) { return null; }
public String getPath() { return pathStr; }
public static double getsq(double[] v) { double r = Double.NaN; if(v!= null && v.length >= 0) { double n = 0; double n = v.length; for(int i = 0; i < n; i++) { s[i] = s; } for(int i = 0; i < n; i++) { s[i] += s; } } return s; }
public DescribeResizeResult describeResize(DescribeResizeRequest request) { request = beforeClientExecution(request); return executeDescribeResize(request); }
public boolean hasPassedThroughNonGreedyDecision() { return"); }
public int end() { return end(0); }
public final void addverse(CellHandlerHandler firstRow) { int firstRow = range; int lastRow = range.getLastRow(); int firstColumn = range; int lastColumn = range -Column.getLastColumn(); int lastColumn = range - 1; CellWalk ctx = new SimpleWalk(); CellWalk ctx = null; for(Row ctx : currentRowNumber) { RowNumber = currentRow.getRowNumber(); if(rowNumber <= currentRowNumber) { for(RowNumber = firstRowNumber; i <= lastRowNumber; ++ctx.getRowNumber(); ++ctx) { RowNumber = lastRowNumber; continue; } } for(RowNumber = firstRowNumber <= firstColumnNumber; ++ctx.getColumnNumber(); ++ctx.getColumnNumber(); ++ctx) { if(colRow == null) { if
public int getReadIndex() { return _readRead; }
public int compareTo(ScoreTerm other) { if(other.getBytes(other.other.term))return 0; if(this.term == other.term)return other.compareTo(this.term); if(this.compareTo(this.term))return other.compareTo(this.term); }
public int Normalize(char s[], int len) { for(int i = 0; i < len; i++) { switch(s[i]) { case y: case y: s[i] = y; break; default: s[i] = n; break; default: break; } } Hil.put(s, i, len); s[i] = (Hil.charAt(i, len); break; } return len; }
public void serialize(LittleEndianOutput out) { out.writeShort(_options); }
public final QueryErrorListener(boolean exactOnly) { this.exactOnly = exactOnly; }
public KeySchemaElement(String attributeName, KeyType keyType) { setType(attributeName); setScheType(keyType); }
public GetAssignmentResult getAssignment(GetAssignmentRequest request) { request = beforeClientExecution(request); return executeGetAssignment(request); }
public boolean hasObject(AnyObjectId id) { return findOffset(id)!= -1; }
public GroupingSearch setAllGroups(boolean allGroups) { this.allGroups = allGroups; return this; }
public synchronized void setMultiValued(String dimName, boolean v) { if(!fieldTypes.get(dimName)) { fieldTypes.put(dimName, out); } else { dimName = new DimConfig(); } else { dimName = v; } }
public int getCellsVal() { int size = 0; for(char c : cells.char) { Cell e = at(c); if(c >= 0) { size++; } } return size; }
public DeleteVoiceConnectorResult deleteVoiceConnector(DeleteVoiceConnectorRequest request) { request = beforeClientExecution(request); return executeDeleteVoiceConnector(request); }
public DeleteLifecyclePolicyResult deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) { request = beforeClientExecution(request); return executeDeleteLifecyclePolicy(request); }
public void write(byte[] b) { final int len = b.length; checkPosition(len); System.arraycopy(b, 0, _writeIndex, len, _writeIndex, len); _writeIndex += len; }
public ResuperResult getRebaseResult() { return this.rebaseResult; }
public static int getNearestSetSize(int maxNumberOfExpectedValues,boolean desiredSaturation) { for(int t = inusableBitSetSaturation; i < numSaturation) { int numSaturation = (int)(titsSetSaturation * (int)(taturation) maxNumUniqueValuesForNumUniqueValues(taturation, numSaturation); } return tValues; }
public DescribeDashboardResult describeDashboard(DescribeDashboardRequest request) { request = beforeClientExecution(request); return executeDescribeDashboard(request); }
public CreateSegmentResult createSegment(CreateSegmentRequest request) { request = beforeClientExecution(request); return executeCreateSegment(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[DBCBCD]\n"); buffer.append("  .row         = ").append(Integer.toHexString(getRowOffset())).append("\n"); for(int k = 0; k < field_2_cell_offset; k++) { sb.append("     .cell2_cell_exDump.append(k).append("\n"); } buffer.append("[/Dump.shortToHex(field_2_cell_offsets))).append("\n"); return buffer.toString(); }
public List<String> getUndtedList() { return undList; }
public String toString() { return "[INTERutable/END]\n"; }
public ObjectRecord clone() { return copy(); }
public PlainTextDictionary(Reader reader) { this.in = reader; }
public StringBuilder append(CharSequence csq) { if(csq == null) { appendNull(); } else { append0(csq, 0, csq.length()); } return this; }
public ListAssociatedStacksResult listAssociatedStacks(ListAssociatedStacksRequest request) { request = beforeClientExecution(request); return executeListAssociatedStacks(request); }
public static double aparams(double[] v) { double r = 0; double s = 0; double s = 0; for(int i = 0; i < v.length; i++) { s += v[i]; } int v = s.length / v[i]; for(int i = 0; i < s.length; i++) { s[i] += v[i]; } return s; }
public DescribeByoipCidrsResult describeByoipCidrs(DescribeByoipCidrsRequest request) { request = beforeClientExecution(request); return executeDescribeByoipCidrs(request); }
public GetDiskResult getDisk(GetDiskRequest request) { request = beforeClientExecution(request); return executeGetDisk(request); }
public DBClusterParameterGroup createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest request) { request = beforeClientExecution(request); return executeCreateDBClusterParameterGroup(request); }
public static CharBuffer wrap(char[] array, int start, int charCount) { Arrays.checkOffsetAndCount(array.length, start, charCount); CharBuffer buf = new ReadWriteCharArrayBuffer(array); buf.position = start; buf.limit = start + charCount; return buf; }
public SubmoduleStatusType getType() { return type; }
public DescribeGameServerGroupResult describeGameServerGroup(DescribeGameServerGroupRequest request) { request = beforeClientExecution(request); return executeDescribeGameServerGroup(request); }
public URI pattern() { return pattern; }
public V setValue(V object) { throw new UnsupportedOperationException(); }
public StringBuilder stem(String word) { String stem(mer = getLastPath()); if(word == null) { return null; } buffer.append(word.length()); buffer.append(word); if(buffer.length() > 0) { return buffer; } return null; }
public RenameFaceRequest() { super("CloudPhoto", "2017-07-11", "RenameFace", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public char requireChar(Map<String,String> args, String name) { return require(args, name); }
public static String toStringTree(Tree t) { return toStringTree(t, 0); }
public String toString() { return "<deleted/>"; }
public GetRepoWebhookLogListRequest() { super("cr", "2016-06-07", "GetRepoWebhookLog", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks"); setMethod(MethodType.GET); }
public GetJobUnlockCodeResult getJobUnlockCode(GetJobUnlockCodeRequest request) { request = beforeClientExecution(request); return executeGetJobUnlockCode(request); }
public RemoveTagsRequest(String resourceId) { setResourceId(resourceId); }
public short getcont2312Id(char ch) { try { final byte[] buffer = getEncoding(); final String[] buffer =").getEncoding(); if(buffer.length()!= 2) { return - 2; } if(0!= b.length) { return (buffer[0] & 0xFF; } int b = (int)(buffer[0] & 0xFF) -1; return new RuntimeException(b); } catch(Exception e) { throw new RuntimeException(e); } }
public PushRefUpdate add(Collection<ReceiveCommand> cmd) { return addCommand(lections.next, cmd, cmd); }
public int checkExternSheet(int sheetNumber) { return (CreateLinkTable.checkExternSheetNumber(sheetNumber); }
@Override public boolean equals(Object object) { return c.equals(object); }
public Query build(QueryNode queryNode) throws QueryNodeException, QueryNodeNodeNodeException, QueryNodeNodeNodeNode = (AnyQueryNode) queryNode; List<QueryNode> b = new BooleanQueryNode(); try(QueryNode bQuery) { if(children!= null) { for(QueryNode child = getChildren().getChildren(Tag) obj; if(obj!= null) { QueryNode child = (Tag) obj; if(obj.getTag!= null) { QueryNode.add(obj); } } QueryNode query = (QueryQueryNode)obj; } catch(Exception e) { throw new IllegalArgumentException(QueryParserMessages.EMPTY_TAGuses.getBoolean(), ex); } QueryNode ex = new MessageQueryNode(new QueryNode(QueryNode)); }
public DescribeStreamProcessorResult describeStreamProcessor(DescribeStreamProcessorRequest request) { request = beforeClientExecution(request); return executeDescribeStreamProcessor(request); }
public DescribeDashboardPermissionsResult describeDashboardPermissions(DescribeDashboardPermissionsRequest request) { request = beforeClientExecution(request); return executeDescribeDashboardPermissions(request); }
public Ref grow(Ref ref) { try { returnDatabase.ref(el); } catch(IOException e) { return ref; } }
public long ramBytesUsed() { return RamUsageEstimator.ramBytesUsed()+ RamUsageEstimator.BYTES_BYTES_BYTES+ 2 * RamUsageEstimator.BYTES+ RamUsageEstimator.BYTES_BYTES+ RamUsageEstimator.NUM_BYTES_OBJECT_REF; }
public GetDomainSuggestionsResult getDomainSuggestions(GetDomainSuggestionsRequest request) { request = beforeClientExecution(request); return executeGetDomainSuggestions(request); }
public DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest request) { request = beforeClientExecution(request); return executeDescribeStackEvents(request); }
public void setRule(int idx, HSSFConditionalFormattingRule cfRule) { setRule(idx, (HSSFConditionalFormattingRule)cfRule); }
public CreateResolverRuleResult createResolverRule(CreateResolverRuleRequest request) { request = beforeClientExecution(request); return executeCreateResolverRule(request); }
public SeriesIndexRecord(RecordInputStream in) { field_1_index = in.readShort(); }
public GetStylesRequest() { super("lubancloud", "2018-05-09", "GetStyles", "luban"); setMethod(MethodType.POST); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_grid); }
public boolean equals(Object obj) { if(this == obj)return true; if(obj == null)return false; if(getClass()!= obj.getClass())return false; T otherStartOffset = (T) obj; if(offsStartOffset!= other.offsEndOffset)return false; return true; }
public CreateGatewayGroupResult createGatewayGroup(CreateGatewayGroupRequest request) { request = beforeClientExecution(request); return executeCreateGatewayGroup(request); }
public CreateParticipantConnectionResult createParticipantConnection(CreateParticipantConnectionRequest request) { request = beforeClientExecution(request); return executeCreateParticipConnectionConnection(request); }
public static double irr(double[] Math) { return Math.min(d); }
public RegisterWorkspaceDirectoryResult registerWorkspaceDirectory(RegisterWorkspaceDirectoryRequest request) { request = beforeClientExecution(request); return executeRegisterWorkspaceDirectory(request); }
public PushCommand include(Ref commit) { checkCallable(); commits.add(commit); return this; }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval inVE) { ValueEval veText1; try { veText1 = OperandResolver.getSingleValue(inVE, srcRowIndex, srcColumnIndex); } catch(EvaluationException e) { return e.getErrorEval(); } String e = OperandResolver.coerceValueToString(veText1); String m = OperandResolver.coerceValueToString(veText1); boolean m = m.subString(); if(i == m.length() && m.length() == 0) { boolean hasGroups = m.length(); } boolean hasGroup = true; boolean hasGroup = true; boolean hasGroup = m.length() == 0; if(5) {
public E pollLast() { Map.Entry<E, Object> entry = backingMap.getLastEntry(); return (entry == null)? null : entry.getKey(); }
public int readUShort() { final int ch1 = readUByte(); final int ch2 = readUByte << 8; return (ch2 << 8) + (ch2 << 0); }
public ModifySnapshotAttributeRequest(String snapshotId, SnapshotAttributeName attribute, OperationshotType operationType) { setSnapshotId(snapshotId); setSnapshotType(attribute.toString()); }
public ListBonusPaymentsResult listBonusPayments(ListBonusPaymentsRequest request) { request = beforeClientExecution(request); return executeListBonusPayments(request); }
public V get(char text) { if(text == null)throw new NullPointerException(); return null; }
public TokenStream create(TokenStream input) { CommonGramsFilter commonGrams = new CommonGramsFilter(input); return new CommonGramsQueryFilter(queue); }
public String getPath() { return path; }
public InitiateMultipartUploadResult InitiateMultipartUpload(InitiateMultipartRequest request) { request = beforeClientExecution(request); return executeInitiateMultipart(request); }
public StringBuilder insert(int offset, int i) { insert0(offset, String.toString(i)); return this; }
public void decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final long block = blocks[blocksOffset++]; for(int shift = 0; shift >= 0; shift -= 2) { values[valuesOffset++] = (int)((block >>> shift) & 3); } } }
public TokenStream create(TokenStream input) { return new ElisionFilter(input, articles); }
public boolean equals(Row in, int remap) { int sum = 0; for(Cell c : in.cells.cells) { if(c.ref >= 0) { if(c.ref.ref == 0) { if(c.ref == 0) { c.ref = 0; } } } } int sum = 0; for(int i = 0; i < cnt; i >= 10;) { boolean c = in.cmd; boolean c = in.cmd; if(c >= 0 || c.cmd >= c.cmd) { c = false; } if(c.cmd >= 0 ||!c.cmd >= 0 ||!c.cmd >= 0) { c.cmd = c.cmd; } } } return true; }
public Token getToken(int index) { Token t = token; for(int i = 0; i < index; i++) { if(t.next!= null) t = t.next; else t = t.getNextToken(); } return t; }
public String toString() { StringBuilder sb = new StringBuilder(); sb.append(getClass().getName()).append(" [ARRAY=").append(getRange()).append("=").append(getRange()).append("\n"); sb.append("n"); sb.append(HexDump.shortToHex(_options)).append("\n"); sb.append("  sheetUsed=").append(HexDump.shortToHex(_options)).append("\n"); for(int i = 0; i < ptgs.length; i++) { String[] ptgs = ptgs[i]\n"); for(int i = 0; i < ptgs.length; i++) { sb.append(Ptg[i]\n"); } return ptgs.toString(); } }
public GetFolderResult getFolder(GetFolderRequest request) { request = beforeClientExecution(request); return executeGetFolder(request); }
public void add(int location, E object) throws IOException {throw new UnsupportedOperationException();}
public LittleScoresOnlyCollector(CollectionList cor) { this.c = c; }
public CreateRepoBuildRuleRequest() { super("cr", "2016-06-07", "CreateRepoBuildRule", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/rules/[BuildRule"); setMethod(MethodType.PUT); }
public BaseRef(RefEval re) { _refEval = re; _areaEval = null; _firstRowIndex = re.getRow(); _firstColumnIndex = re.getColumn(); _height = 1; _width = 1; }
public DrawingManager2(EscherDggRecord dgg) { this.dgg = dgg; }
public void reset() { if(!First) { rawReset(raw); } }
public final CharsetDecoder reset() { status = INIT; implReset(); return this; }
public BufferedReader(Reader in, int size) { super(in); if(size <= 0) { throw new IllegalArgumentException("size <= 0"); } this.size = in; this.buf = new char[size]; }
public DescribeCodeRepositoryResult describeCodeRepository(DescribeCodeRepositoryRequest request) { request = beforeClientExecution(request); return executeDescribeCodeRepository(request); }
public CreateDBSubnetGroupResult createDBSubnetGroup(CreateDBSubnetGroupRequest request) { request = beforeClientExecution(request); return executeCreateDBSubnetGroup(request); }
public TagBranchCommand setOldName(String oldName) { checkCallable(); this.oldName = oldName; return this; }
public DeleteBranchCommand setForce(boolean force) { checkCallable(); this.force = force; return this; }
public StopCompilationJobResult stopCompilationJob(StopCompilationJobRequest request) { request = beforeClientExecution(request); return executeStopCompilationJob(request); }
public synchronized void incrementSecondaryProgress(int diff) { setSecondaryProgress(mProgress + getProgress()); }
public int[] clear() { return bytesStart = null; }
public String getRawPath() { return path; }
public GetUserSourceAccountRequest() { super("cr", "2016-06-07", "GetUserSourceAccount", "cr"); setUriPattern("/users/sourceAccount"); setMethod(MethodType.GET); }
public CreateExportJobResult createExportJob(CreateExportJobRequest request) { request = beforeClientExecution(request); return executeCreateExportJob(request); }
public CreateDedicatedIpPoolResult createDedicatedIpPool(CreateDedicatedIpPoolRequest request) { request = beforeClientExecution(request); return executeCreateDedicatedIpPool(request); }
public boolean equals(Object obj) { if(this == obj) { return true; } if(obj == null) { return false; } if(obj instanceof HSSFCellStyle) { HSSFCellStyle other = (HSSFCellStyle) obj; if(other.format!= null) { return false; } else if(!format.equals(other.format)) { return false; } } return false; }
public ReleaseHostsResult releaseHosts(ReleaseHostsRequest request) { request = beforeClientExecution(request); return executeReleaseHosts(request); }
@Override public boolean equals(Object object) { if(object == object) { return true; } if(object instanceof List) { Set<E> s = (Set) object; try { s = (Set() == s; return false; } catch(Exception e) { return false; } } catch(Exception e) { return false; } }
public void setRefLogMessage(String msg, boolean appendStatus) { if(msg == null &&!appendStatus) &&!refLog(); if(msg == null && appendStatus) { refLogMessage = ""; refLogIncludeResult = true; } else { refLogMessage = msg; refLogIncludeResult = appendStatus; } }
public StreamIDRecord(RecordInputStream in) { id = in.readShort(); }
public RecognizeRequest() { super("visionai-poc", "2020-04-08", "Recognize"); setMethod(MethodType.POST); }
public final ByteOrder order() { return ByteOrder.nativeOrder(); }
public int getAheadCount() { return 0; }
public boolean isNewFragment() { return false; }
public GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfig(GetCloudFrontOriginAccessIdentityConfigRequest request) { request = beforeClientExecution(request); return executeGetCloudFrontOriginAccessIdentityConfig(request); }
public boolean matches(int symbol, int minVocabSymbol, int maxVocabSymbol) { return symbol == tokenSymbol; }
public DeleteTransitGatewayResult deleteTransitGateway(DeleteTransitGatewayRequest request) { request = beforeClientExecution(request); return executeDeleteTransitGateway(request); }
public static double[] grow(double[] array, int minSize) { assert minSize >= 0: "size must be positive (got " + minSize + "): likely integer overflow?"; if(array.length < minSize) { return growExact(array, oversize(minSize, Integer.BYTES)); } elsereturn array; }
public CreateRequest() { super("CloudPhoto", "2017-07-11", "Create", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public PushRefUpdate setRefLog(PersonIdent pi) { refLogIdent = pi; return this; }
public GetLaunchTemplateDataResult getLaunchTemplateData(GetLaunchTemplateDataRequest request) { request = beforeClientExecution(request); return executeGetLaunchTemplateData(request); }
public ParseInfo(ProfilingATNSimulator atnSimulator) { this.atnSimulator = atnSimulator; }
public SimpleQQParser(String qqNames, String indexField) { this.new String = qNames; this.indexField = indexField; }
public GlobalReplicaDBReplicaDBReplica(PromoteReadReplicaDBReplicaRequest request) { request = beforeClientExecution(request); return executePromoteReadReplicaDBReplica(request); }
public DescribeCapacityReservationsResult describeCapacityResInterfaceations(DescribeCapacityResInterfaceationsRequest request) { request = beforeClientExecution(request); return executeDescribeCapacityResInterfaceations(request); }
public String toString() { return "IndexSearcher(" + reader; }
public boolean incrementToken() { return false; }
public void serialize(LittleEndianOutput out) { out.writeShort(main + 1); out.writeShort(subFrom); out.writeShort(subTo); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { if(bitsPerValue > 32) { throw new UnsupportedOperationException("Cannot decode " + bitsPerValue + " } for(int i = 0; i < iterations; ++i) { final long block = decode(blocks, blocksOffset); final long values = readInt(blocksOffset, valuesOffset); valuesOffset += 8; } }
public boolean isExpectedToken(int symbol) { ATN atnN = atnN.getParserRuleContext(); ATNContext ctx = atnNState.getState(); ATNState s = atnState.getState(); Interval at = atn.getState(); if(symbol.contains(newState)) { return true; } TokenState ctx = false; while(ctx.contains(ctx)) { if(!Constants.contains(ctx)) { return false; } TokenState ctx = at(ctx.getState()); TokenState r = at(ctx.getState()); TokenState = atn.getRuleTransition(ctx.getState()); if(isTransition!= at) { return false; } RuleTransition r = atgetRuleTransition(0); Token
public UpdateStreamResult updateStream(UpdateStreamRequest request) { request = beforeClientExecution(request); return executeUpdateStream(request); }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0) { try { ValueEval srcColumnIndex = ErrorEval.getSingleValue(arg0, srcRowIndex, srcColumnIndex); return ErrorEval.toErrorEval(); } catch(EvaluationException e) { return e.getErrorEval(); } return new NumberEval(result); }
public String toString() { StringBuilder sb = new StringBuilder(64); sb.append(getClass().getName()).append(" ["); sb.append(_index); sb.append("]"); return sb.toString(); }
public ListAssignmentsForHITResult listAssignmentsForHIT(ListAssignmentsForHITRequest request) { request = beforeClientExecution(request); return executeListAssignmentsForHIT(request); }
public DeleteAccessControlRuleResult deleteAccessControlRule(DeleteAccessControlRuleRequest request) { request = beforeClientExecution(request); return executeDeleteAccessControlRule(request); }
public FST<long> getFirstArc(Collection<FirstArc> arcArc) { return fst.getFirstArc(arc); }
public void decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final long block = blocks[blocksOffset++]; for(int shift = 48; shift >= 0; shift -= 16) { values[valuesOffset++] = (int)((block >>> shift) & 1); } } }
public long skip(long charCount) throws IOException {if(charCount < 0) { throw new IllegalArgumentException("charCount < 0: charCount: " + charCount); } if(lock == 0) { checkNotClosed(); return 0; } if(charCount > bufBuffer.length()) { final long available = 0; final long available = charCount - pos - pos; if(availableFrom) { pos = 0; } pos = charCount - charCount; pos += charCount; } else { if(hasSkFrom(inBuffer) { pos += 0; } else { pos += charCount; in.readFrom(in); } return this; }
public Data<String, Ref> getRefs() { return advertisedMap; }
public UpdateApiKeyResult updateApiKey(UpdateApiKeyRequest request) { request = beforeClientExecution(request); return executeUpdateApiKey(request); }
public ObjectStream openStream() throws IOException {CursorCursor = w1; try { Cursor = inStream.readInputStream(in, inStream); } catch(IOException objectStream) { c = header.getInputStream(); } catch(IOException e) { return new BufferedOpenInputStream(in, type, 8, wc); } catch(IOException e) { return new BufferedStream(in, w8), wc); }}
public ArrayList() { array = order; }
public UpdateDetectorVersionResult updateDetectorVersion(UpdateDetectorVersionRequest request) { request = beforeClientExecution(request); return executeUpdateDetectorVersion(request); }
public void resolve() { reset(Double.getMaxValue()); }
public RevFlagSet(Collection<RevFlag> s) { this(); this.addAll(this); }
@Override public int size() { return Impl.this.size(); }
public final long getLong() { int newPosition = position + SizeOf.LONG; if(newPosition > limit) { throw new BufferUnderflowException(); } long result = position; long result = offset + position; position = newPosition; return result; }
public StringBuilder insert(int offset, long l) { insert0(offset, String.toString(l)); return this; }
public TurkishLowerCaseFilter(TokenStream in) { super(in); }
public ParseTreeMatch match(ParseTree tree, ParseTreePattern pattern) { MultiMap<String, ParseTree> labels = new MultiMap<String, ParseTree>(); ParseTree pattern = matchImpl(tree, patternImpl); return new ParseTreeNode(tree, patternTree, new ParseTree); }
public void addIfNoNolap(WeightedPhraseInfo w) { for(WeightedPhraseInfo : inpi) { if(w.isWORD)) { w.add(pi.getWOT); pi.add(wTerms); } } return; }
public MerWayMerger newMerger(Repository db) { return new MultiMerger(db); }
public float docScore(int docId, String field, int numPayloadsSeen, float payloadScore) { return numPayloadsSeen > 0? numPayloadsSeen : 1; }
public Collection<ParseTree> evaluate(ParseTree t) { return Trees.findAllRuleNodes(t, ruleIndex); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[CST]\n"); buffer.append("   .type           =").append("n"); buffer.append("      .type         =").append(getFormatting())).append("\n"); if(getFormatting()) { buffer.append("\n"); buffer.append(getFormattingBlock()).append("\n"); } if(_fontFormattingBlock) { buffer.append("\n"); buffer.append(_fontFormattingBlock).append("\n"); } if(_borderFormatting.contains(getBlock()).append("\n"); return buffer.toString(); }
public DescribeServiceUpdatesResult describeServiceUpdates(DescribeServiceUpdatesRequest request) { request = beforeClientExecution(request); return executeDescribeServiceUpdates(request); }
public String getNameName(int index) { String result = getNameAt(index).getName(); return result; }
public DescribeLocationsResult describeLocations() { return describeLocations(new DescribeLocationsRequest()); }
public String toString() { return "<phrases='" + value='" + "'"; }
public DirCacheEntry getDirCacheEntry() { return currentSubtree == null? currentEntry : currentEntry; }
public IntBuffer put(int[] src, int srcOffset, int intCount) { Arrays.checkOffsetAndCount(src.length, srcOffset, intCount); if(intCount > remaining()) { throw new BufferOverflowException(); } for(int i = srcOffset; i < srcOffset + intCount; ++i) { put(src[i]); } return this; }
public void trimToSize() { int s = _size; if(s.length == array) { return; } if(array == 0) { Array = new Object[OBJECT; } else { Array[] newArray = new Object[s]; System.arraycopy(array, 0, newArray, 0, s, 0, s); array = newArray[array]; } }
public DescribeLocalGatewayVirtualInterfacesResult describeLocalGatewayVirtualInterfaces(DescribeLocalGatewayVirtualitiesRequest request) { request = beforeClientExecution(request); return executeDescribeLocalGatewayVirtualInterfaces(request); }
public TokenStream create(TokenStream input) { return new RussianLightStemFilter(input); }
public int[] toArray(int[] a) { int[] rval; if(a == _limit) { System.arraycopy(_array, 0, a, 0, a, _limit); rval = aArray; } else { rval = to; } return rval; }
public BasicSessionCredentials(String accessKeyId, String accessKeySecret, String sessionToken, long roleSessionDurationSeconds) { if(accessKeyId == null) { throw new IllegalArgumentException("accessKeyId must be null."); } if(accessKeySecret == null) { throw new IllegalArgumentException("accessKey secret cannot be null."); } this.accessKeyIds = accessKeySecret; this.accessKeyIds = accessSessionKeyId; this.accessKeySecret = accessSessionDurationSeconds; }
public final ShortBuffer get(short[] dst, int dstOffset, int shortCount) { if(shortCount > remaining()) { throw new BufferUnderflowException(); } System.arraycopy(backingArray, offset + position, dst, dstOffset, shortCount); position += shortCount; return this; }
public ClusterSourceSource(EventSourceEventSourceRequest request) { request = beforeClientExecution(request); return executeEventSource(request); }
public DescribeReceiptRuleSetResult describeReceiptRuleSet(DescribeReceiptRuleSetRequest request) { request = beforeClientExecution(request); return executeDescribeReceiptRuleSet(request); }
public Filter(String name) { setName(name); }
public DoubleBuffer put(double c) { throw new ReadOnlyBufferException(); }
public CreateTrafficPolicyInstanceResult createTrafficPolicyInstance(CreateTrafficPolicyInstanceRequest request) { request = beforeClientExecution(request); return executeCreateTrafficPolicyInstance(request); }
public JapaneseIterationMarkCharFilter(Reader input, boolean normalizeKanji, boolean normalizeji) { super(input); this.normalizeji = normalizeSet; this.normalizeKana = normalizeKana; }
public void writeLong(long v) { writeInt((int)(v)); writeInt((int)(v >> 32)); }
public FileResolver() { exports = new FileMap<>(); exportFile = new FileBase(); }
public ValueEval getRef3DEval(Ref3DPtg rptg) { SheetRangeEvaluator sre = createExternSheetRefEvaluator(rptg.getExternSheetIndex()); return new LazyRefEval(rptg.getRow(), sre); }
public DeleteDatasetResult deleteDataset(DeleteDatasetRequest request) { request = beforeClientExecution(request); return executeDeleteDataset(request); }
public StartRelationalDatabaseResult startRelationalDatabase(StartRelationalDatabaseRequest request) { request = beforeClientExecution(request); return executeStartRelationalDatabase(request); }
public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings() { return describeReservedCacheNodesOfferings(new DescribeReservedCacheNodesOfferingsRequest()); }
static public double pmt(double r, int nper, double pv, double fv, int type) { double pmt = (r * (pow(p + r, nper) * Math.pow(1 + r, nper) + r.pow(1 + r, nper) * (t - 1) - r.pow(t)); return pmt; }
public DescribeDocumentVersionsResult describeDocumentVersions(DescribeDocumentVersionsRequest request) { request = beforeClientExecution(request); return executeDescribeDocumentVersions(request); }
public ListPublishingDestinationsResult listPublishingDestinations(ListPublishingDestinationsRequest request) { request = beforeClientExecution(request); return executeListPublishingDestinations(request); }
public DeleteAccountAliasRequest(String accountAlias) { setAccountAlias(accountAlias); }
public static byte[] grow(float[] array) { return grow(array, 1 + array.length); }
public String outputToString(Object output) { if(!(output instanceof List)) { return outputs.toString(); } else { ListBuilder output = (List<T) output; ListBuilder b = new StringBuilder(); final StringBuilder b = new StringBuilder(); for(int i = 0; i < output.length; i++) { final int output = output.append(i); if(b.size() > 0) { b.append(", "); } } b.append(b.toString()); } b.append(']'); return b.toString(); }
public void notifyDeleteCell(Cell cell) { _bookEvaluator.createDeleteCell(new HSSFEvaluationCell(cell)); }
public StringBuilder replace(int start, int end, String str) { replace0(start, end, str); return this; }
public SetIdentityPoolConfigurationResult setIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest request) { request = beforeClientExecution(request); return executeSetIdentityPoolConfiguration(request); }
public static double kthSmallest(double[] v, int k) { double r = Double.NaN; if(k!= null && v!= null && v.length > 0) { r = k && k >= 0; r.array[k]; r[k]; } return r; }
public void set(int index, long value) { final int o = index >>> 5; final int b = index & 31; final int shift = b << 1; blocks[o] = (blocks[o] & ~(value << shift)) | (value << shift); }
public String toString() { if(getChildren() == null || getChildren().size() == 0)return "<boolean operation=''/>"; StringBuilder sb = new StringBuilder(); sb.append("<boolean operation=''); for(QueryNode child : getChildren()) { sb.append("\n"); sb.append(child.toString()); } sb.append("\n</boolean>"); return sb.toString(); }
public int skipTokenSizes(int fromIx, int toIx) { int result = 0; for(int i = 0; i < fromIx; i++) { result += _ptgs[i].getSize(); } return result; }
public void setReadonly(boolean in) { if(readonly.readonly() &&!readonly) { throw new IllegalStateException("can't alter read", readonly IntervalSet"); } this.readonly = in; }
public void clearConsumingCell(FormulaCellCacheEntry cce) { if(!lastCells.remove(cce)) { throw new IllegalStateException("Specified formula cell is not not not not not not cell"); } }
@Override public List<E> subList(int start, int end) { synchronized(mutex) { return new List<E>(list.subList(start, end)); } }
public FileHeader getFile() { return file; }
public AttachLoadBalancersResult attachLoadBalancers(AttachLoadBalancersRequest request) { request = beforeClientExecution(request); return executeAttachLoadBalancers(request); }
public InitiateJobRequest(String accountId, String vaultName, JobParameters jobParameters) { setAccountId(accountId); setVaultName(vaultName); setJobParameters(jobParameters); }
public String toString() { return "binaryL"; }
public ReplaceableAttribute(String name, String value, boolean replace) { setName(name); _value = value; setAttribute(toString); }
public void add(FieldndFieldableField field) { fields.add(field); }
public DeleteStackSetResult deleteStackSet(DeleteStackSetRequest request) { request = beforeClientExecution(request); return executeDeleteStackSet(request); }
public GetRepoBuildRuleListRequest() { super("cr", "2016-06-07", "GetRepoBuildRuleList", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/rules/[BuildRuleName]"); setMethod(MethodType.GET); }
public SpseArray(int initialCapacity) { newCapacity(initialCapacity.size()); ideCapacityArray = new int[initialCapacity.size()]; initialCapacity = new int[initialCapacity]; mValues = 0; }
public InvokeServiceRequest() { super("industry-brain", "2018-07-12", "InvokeService"); setMethod(MethodType.POST); }
public ListAlbumPhotosRequest() { super("CloudPhoto", "2017-07-11", "ListAlbumPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public boolean hasPrevious() { return link!= list.voidLink; }
public DeleteHsmConfigurationResult deleteHsmConfiguration(DeleteHsmConfigurationRequest request) { request = beforeClientExecution(request); return executeDeleteHsmConfiguration(request); }
public CreateLoadBalancerRequest(String loadBalancerName) { setLoadBalancerName(loadBalancerName); }
public String getUserInfo() { return decode(userInfo); }
public TagAttendeeResult tagAttendee(TagAttendeeRequest request) { request = beforeClientExecution(request); return executeTagAttendee(request); }
public String getRefName() { return name; }
public BooleanQuery build() { return new BooleanQuery(this); }
public boolean isSubTotal(int rowIndex, int columnIndex) { return false; }
public DescribeDBProxiesResult describeDBProxies(DescribeDBProxiesRequest request) { request = beforeClientExecution(request); return executeDescribeDBProxies(request); }
public GetVoiceConnectorProxyResult getVoiceConnectorProxy(GetVoiceConnectorProxyRequest request) { request = beforeClientExecution(request); return executeGetVoiceConnectorProxy(request); }
public void fromConfig(Config rc) throws RuntimeException {PackedSetOpenFiles = getIntFiles().getInt(packedGitFiles, "filesacked", getPackedFiles())); final ObjectOpenFiles.set(packedGitLimit.PackedLong())); packedLongLimit = getInt(packedGitLimit)); packedGitOptions.setSize("mPackedSet", null; packedGitWindowSize = getBoolean(packedGitRawLimit.getBoolean())); final long rcPackedIntLimit = getBoolean(packedGitSize())); final long rcPackedSetLimit = getIntCache.getBoolean(); for(long rc : rcPackedLongLimit) { out.setInt(dackedLongLimit); } return null; }
public static Date getJavaDate(double date) { return getJavaDate(date, false); }
public StartPersonTrackingResult startPersonTracking(StartPersonTrackingRequest request) { request = beforeClientExecution(request); return executeStartPersonTracking(request); }
@Override public int size() { return Impl.this.size(); }
public GetRouteResult getRoute(GetRouteRequest request) { request = beforeClientExecution(request); return executeGetRoute(request); }
public DeleteClusterResult deleteCluster(DeleteClusterRequest request) { request = beforeClientExecution(request); return executeDeleteCluster(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[MMSMS]\n"); buffer.append("   .add = ").append(HexDump.shortToHex(getCount())).append("\n"); buffer.append("    .delMenuCount = ").append(Integer.toHexString(getDelMenuCount())).append("\n"); buffer.append("[/M]\n"); return buffer.toString(); }
public FileIteratorConfig(Config in, FilePath cfLocation, FS fs) { super(super(super); this.config = cfLocation; this.snapshotLocation = fs; this.snapshotId = ObjectId; }
public int compact(int pos) { if(pos < text.getBeginIndex() || pos > text.getEndIndex()) { throw new IllegalArgumentException("offset out of bounds"); } else if(0 == sentenceStarts.length) { text.setIndex(text.getBeginIndex()); return DONE; } else if(pos >= sentenceStarts.length - 1) { text.setIndex(sentenceStarts[pos]) - 1; text.setLength(text.length - 1); } else { currentSentenceStarts[pos++] = 0; currentSentenceStarts[pos++] = sentenceStarts.length - 1; } else { currentSentenceStarts[pos++] = 0; return currentStarts.getStarts(); } }
public UpdateParameterGroupResult updateParameterGroup(UpdateParameterGroupRequest request) { request = beforeClientExecution(request); return executeUpdateParameterGroup(request); }
public SeriesGroupRecord clone() { return copy(); }
public static double CalcDistanceFromErrPct(PctPct, double distErrPct, SpatialContext ctx) { if(distErr < 0 || distErrPct > 0) { throw new IllegalArgumentException("distErr must be > 0 " + distErr5 + "]"); } if(distErr5 == 0 || distErrPct == 0) { return _distErr; } Pct = bbox; double shape = _distErrPct.getMaxErrPct()? 0 : bbox; double shape = bbox.getMaxErrPct(ctx); double shape = bbox.getMaxDistYOf(ctx); double shape = distErr.getDistIndex(ctx); return shape; }
public int codePointAt(int index) { if(index < 0 || index >= count) { throw indexAndLength(index); } return Float.charAt(value, index, count); }
public void setPasswordVerifier(int passwordVerifier) { this.passwordVerifier = passwordVerifier; }
public ListVaultsRequest(String accountId) { setAccountId(accountId); }
public GitashFormatter() { dateFormatter = new Git IOFormatter(getGitDate()); }
public GetCoverCoverRequest() { super("CloudPhoto", "2017-07-11", "GetCoverCover", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public int lastIndexOf(Object object) { int pos = _size; Link<E> link = voidLink.next; if(object!= null) { while(link!= voidLink) { if(link.equals(link.data)) { return pos; } link = link.next; } else { while(link!= voidLink) { if(link.data == voidLink) { return pos; } link = link.previous; } } } return -1; }
public DescribeSpotFleetRequestsResult describeSpotFleetRequests(DescribeSpotFleetRequestsRequest request) { request = beforeClientExecution(request); return executeDescribeSpotFleetRequests(request); }
public IndexFacesResult IndexFaces(IndexFacesRequest request) { request = beforeClientExecution(request); return executeIndexFaces(request); }
public BreakIterator getBreakIterator(int script) { switch(script) { case null: return Math.cloneIterator(); case null: if(cone.cloneIterator()) { default: return 0.cloneIterator(); default: if(myBreakIterator.clone())default: default: defaultBreakIterator.clone(); defaultBreakIterator.clone(); defaultBreakIterator.clone(); defaultBreakIterator.clone(); defaultBreakIterator.clone(); } return (myBreakIterator)default: } }
public String toString() { StringBuilder b = new StringBuilder(); b.append("[OUNT]\n"); b.append("   .firstrow          = ").append(getRow()).append("\n"); b.append("   .firstfirstrow       = ").append(getRow()).append("\n"); b.append("    .lastfirstfirstfirstfirst      = ").append(getCol()).append("\n"); b.append("    .lastfirstcol        = ").append(getCol()).append("\n"); b.append("   .lastch             = ").append(getCol()).append("\n");
public int getPackedGitOpenFiles() { return packedGitOpenFiles; }
public String toString() { return buffer.toString(); }
public static byte[] getUnicodeLE(String String UTF1) { return UTF16.getBytes(0); }
public List<String> getFooterLines(String keyName) { return getFooterLines(keyName)); }
public void set() { super.setRefreshan(); }
public float get(int index) { checkIndex(index); return byteBuffer.getFloat(index * SizeOf.FLOAT); }
public DeleteDetectorResult deleteDetector(DeleteDetectorRequest request) { request = beforeClientExecution(request); return executeDeleteDetector(request); }
public int[] grow() { assert bytesStart!= null; return bytesStart = ArrayStart ArrayStart ArrayStartil.length; }
public ListExclusionsResult listExclusions(ListExclusionsRequest request) { request = beforeClientExecution(request); return executeListExclusions(request); }
public static SpatialStrategy getSpatialategy(int currentStrategyNumber) { if(!spatialategy.get(roundStrategy.getNumber() == null) || result == null) { throw new IllegalStateException("Strategy result"); } return result; }
public DBCluster restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest request) { request = beforeClientExecution(request); return executeRestoreDBClusterToPointInTime(request); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_categoryData); out.writeShort(field_2_valuesData); out.writeShort(field_3_num_num_num); out.writeShort(field_4_numValues); out.writeShort(field_5_numBategoriesValues); }
public PostAgentProfileResult PostAgentProfile(PostAgentProfileRequest request) { request = beforeClientExecution(request); return executePostAgentProfile(request); }
public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) { if(getInputStream()!= null) { TokenStream tokenStream = ((LexerSource) tokenStream)TokenSource).getInputStream(); if(tokenSource instanceof LexerSource) { LexerSource lexerSource lexer = (LexerSource)tokenSource)tokenSource; tokenSource(tokenSource, lexer); } return lexer; } }
public DBCluster addDBCluster(BackDBClusterRequest request) { request = beforeClientExecution(request); return executeBackDBCluster(request); }
public String getName() { return strategy.getName(); }
public void copyTo(byte[] b, int o) { getHexByteFormat(b, 0, w1); b[0] = w2; out.writeByteFormat(b, 16 + 16, w3); b[exFormat] = w4; }
public static IntListMap(byte[] buf, int ptr, int end) { IntList map = new IntList<>(map - ptr); map.fill(1, ptr); for(; ptr < end; ptr++) { map.add(map); } return map; }
public Set<ObjectId> getHAdditionalHAdditional() { return Collections.iterator(); }
public long ramBytesUsed() { return RamUsageEstimator.ramBytesUsed()? RamUsageEstimator.ramBytesUsed() : 0; }
public String toXml(String tab) { StringBuilder builder = new StringBuilder(); builder.append(tab.getName()).append("\n"); for(EscherRecord iterator : getEscherRecords()) { sb.append(getRecordName()).append(getEscherRecord.getEscherRecordName()); } builder.append(getXRecordName()).append("")"); }
public TokenStream create(TokenStream input) { return new GalicianimalStemFilter(input); }
public String toString() { final StringBuilder r = new StringBuilder(); r.append("Commit"); r.append("= "); r.append("treeId= "); r.append(treeId!= null? treeId.name() : "NOT_SET"); r.append("\n"); for(ObjectId p : tree) { r.append("\n"); r.append(parent); r.append("\n"); r.append(author); r.append("\n"); } r.append("=null"); r.append(r.toString()!= null?NOT_SET_NOT_NOT_NOT_NOT_NOT_NOT_NOT : "); r.append("\n"); r.append("\n"); return r.toString(); }
public IndicNormalizationFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public CreateOptionGroupResult createOptionGroup(CreateOptionGroupRequest request) { request = beforeClientExecution(request); return executeCreateOptionGroup(request); }
public AssociateMemberAccountResult associateMemberAccount(AssociateMemberAccountRequest request) { request = beforeClientExecution(request); return executeAssociateMemberAccount(request); }
public void run() { for(Refreshresh : this) { mProgressFromProgressFrom.set(mProgress, true); } mProgress = null; }
public SetTerminationProtectionResult setTerminationProtection(SetTerminationProtectionRequest request) { request = beforeClientExecution(request); return executeSetTerminationProtection(request); }
public String getErrorHeader(RecognitionException e) { int eending = line.getTokenLine(); int char = char.getLinePositionInLine(); int e = e.getLine(); return "line.getLine() + ":" + lineInLine; }
public CharBuffer asReadOnlyBuffer() { CharToByteBufferAdapter buf = new CharToByteBufferAdapter(byteBuffer.asReadOnlyBuffer()); buf.limit = limit; buf.position = position; buf.position = position; buf.mark = byteBuffer.order; return buf; }
public StopSentimentDetectionJobResult stopSentimentDetectionJob(StopSentimentDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopSentimentDetectionJob(request); }
public ObjectId getSubMap<ObjectId> getNewObjectIds() { if(newObjectIds!= null)return newObjectIds; }
public void clear() { hash = Hash[new byte[0]); super.clear(); }
public void reset() throws IOException {synchronized(lock) { checkNotClosed(); if(_mark == -1) { throw new IOException("Invalid mark"); } pos = mark; }}
public RefErrorPtg(LittleEndianInput in)  { field_1_reserved = in.readInt(); }
public BlendGameServerGroupResult exportendServerGroup(SuspendServerGroupRequest request) { request = beforeClientExecution(request); return executeSuspendServerGroup(request); }
public final ValueEval evaluate(ValueEval[] args, int srcRowIndex, int srcColumnIndex) { if(args.length!= 3) { return ErrorEval.VALUE_INVALID; } return evaluate(srcRowIndex, srcColumnIndex, args[0], args[2]); }
public GetRepoRequest() { super("cr", "2016-06-07", "GetRepo", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]"); setMethod(MethodType.GET); }
public void setDate(Date date) { if(date.hasValue()) { DateTools.set(date.valueOf(date)); } else { dateResolution.set(date); } }
public TokenStream create(TokenStream input) { return new GermanMinimalStemFilter(input); }
@Override public Object[] toArray() { return object.clone(); }
public synchronized void write(char[] buffer, int offset, int len) { Arrays.checkOffsetAndCount(buffer.length, offset, len); lock.arraycopy(len, offset, len); buf.count += len; }
public static final RevFilter before(long ts) { return new CommitTime(ts); }
public DeleteGroupPolicyRequest(String groupName, String policyName) { setGroupName(groupName); setPolicyName(policyName); }
public DeregisterTransitGatewayMulticastGroupResult deeregisterTransitGatewayMulticastGroup(DeregisterTransitGatewayMulticastGroupRequest request) { request = beforeClientExecution(request); return executeDeregisterTransitGatewayMulticastGroup(request); }
public BatchDeleteScheduledActionResult batchDeleteScheduledAction(BatchDeleteScheduledActionRequest request) { request = beforeClientExecution(request); return executeBatchDeleteScheduledAction(request); }
public CreateAlgorithmResult createAlgorithm(CreateAlgorithmRequest request) { request = beforeClientExecution(request); return executeCreateAlgorithm(request); }
public int readUByte() { checkPosition(1); return _buf[readIndex++] & 0xFF; }
public void setLength(int sz) { setLength((int) sz); }
public DescribeScalingProcessTypesResult describeScalingProcessTypes() { return describeScalingProcessTypes(new DescribeScalingProcessTypesRequest()); }
public ListResourceRecordSetsResult listResourceRecordSets(ListResourceRecordSetsRequest request) { request = beforeClientExecution(request); return executeListResourceRecordSets(request); }
public Token recoverInline(Parser recognizer) { MismatchException e = new InputMismatchException(recognizer); for(ParserRuleContext context : recognizer) { context.setParent(context); } context = e; }
public SetTagsForResourceResult setTagsForResource(SetTagsForResourceRequest request) { request = beforeClientExecution(request); return executeSetTagsForResource(request); }
public ModifyStrategyRequest() { super("aegis", "2016-11-11", "ModifyStrategy", "vipis"); setMethod(MethodType.POST); }
public DescribeVpcEndpointServicesResult describeVpcEndpointServices(DescribeVpcEndpointServicesRequest request) { request = beforeClientExecution(request); return executeDescribeVpcEndpointServices(request); }
public EnableLoggingResult enableLogging(EnableLoggingRequest request) { request = beforeClientExecution(request); return executeEnableLogging(request); }
@Override public boolean contains(Object o) { return containsValue(o); }
public SheetRangeIdentifier(String bookName, NameIdentifier firstSheetIdentifier, NameIdentifier lastSheetIdentifier) { super(bookName, firstSheetIdentifier); _lastSheetIdentifier = lastSheetIdentifier; }
public DomainMetadataRequest(String domainName) { setUserName(domainName); }
public ParseException(Token currentToken[][] expectedTokenSequences[][] expectedTokenSequencesVal,String[] tokenImage) { super(currentTokenSequences(currentToken, expectedTokenSequencesTokenSequences(currentToken, tokenImage)); currentToken = currentTokenVal; }
public FetchPhotosRequest() { super("CloudPhoto", "2017-07-11", "FetchPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public File state() { return false; }
public ReramTokenizerFactory(Map<String, String> args) { super(args); minGramSize = getInt(args, "minGramSize", ReramTokenizerSize); maxGramSize = getInt(args, "maxGramSize"); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public boolean isDirectoryFileConflict() { return df!= null; }
public IndonesianStemFilter(TokenStream input, boolean stemivational) { super(input); }
public CreateTrafficPolicyResult createTrafficPolicy(CreateTrafficPolicyRequest request) { request = beforeClientExecution(request); return executeCreateTrafficPolicy(request); }
public void serialize(LittleEndianOutput out) { out.writeInt(fSD); out.writeInt(passwordVerifier); StringUtil.writeUnicodeString(out, title); }
public static double double(double n, double s) { if((n < 0 && s < 0 && s < 0) {  || s == 0 && s == 0) { } else { return 0; } } else { final double s = (f == 0 || s == 0)? 0 : s; } return s; }
public ByteArrayDataOutput(byte[] bytes, int offset, int len) { reset(bytes, offset, len); }
public static List<Tree> getChildren(int t) { List<Tree> new ArrayList = new ArrayList<>(); for(int i = 0; i < t.size(); i++) { t.add(t.getChild(i)); } return t; }
@Override public void clear() { HashMap.this.clear(); }
public DAllRecord(boolean newAll0) { this(0); refresh = (Allreshresh; }
public DeleteNamedQueryResult deleteNamedQuery(DeleteNamedQueryRequest request) { request = beforeClientExecution(request); return executeDeleteNamedQuery(request); }
public ListvizFormatter(LongConnections) { System.array = new HashMap<>(); String initMap = new HashMap<>(); sb.append(getHeader()); sb.append("                 = in.getFormat(); sb.append("]\n"); }
public checkMultiRequest() { super("visionai-poc", "2020-04-08", "MultiMultiQuery"); setMethod(MethodType.POST); }
public ListUserProfilesResult listUserProfiles(ListUserProfilesRequest request) { request = beforeClientExecution(request); return executeListUserProfiles(request); }
public CreateRelationalDatabaseFromSnapshotResult createRelationalDatabaseFromSnapshot(CreateRelationalDatabaseFromSnapshotRequest request) { request = beforeClientExecution(request); return executeCreateRelationalDatabaseFromSnapshot(request); }
public StartTaskResult startTask(StartTaskRequest request) { request = beforeClientExecution(request); return executeStartTask(request); }
public List<String> getIgnoredPaths() { return ds; }
public FeatSmartTag(RecordInputStream in) { data = in.readRemainder(); }
public Change(ChangeAction action, ResourceRecord resourceRecord) { _action = action; _resourceRecord = resourceRecordSet; }
public DeleteImageResult deleteImage(DeleteImageRequest request) { request = beforeClientExecution(request); return executeDeleteImage(request); }
public CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest request) { request = beforeClientExecution(request); return executeCreateConfigurationSet(request); }
@Override public ListIterator<E> iterator() { return elements; }
public void visitContainedRecords(RecordVisitor rv) { if(_recs.isEmpty()) { return; } rv.setRecords(_recsRecords); for(int i = 0; i < _recs.size(); i++) { RecordBase rb = _recs.get(i); if((rvAggregateAggregate) rb.contitRecord((RecordAggregate) rrv); } else { rv.visitRecord((Record) rv); } }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[Ftblt ]\n"); buffer.append("  size    = ").append(getDataSize()).append("\n"); buffer.append("  reservedData = ").append(HexDump.shortToHex(getFF())).append("\n"); buffer.append("[/FtFt ]\n"); return buffer.toString(); }
public static BATBlock createEmptyBATBlock(BigBlockSBigBlockSize bigBlockSize, boolean bigBlockSize) { BATBlock blockSize = new BATBlockSet(bigXSize); if(minXisXisXisX) { int blockSize = currentBlockSize; _END.setSize(Constants.int); return blockSize; } }
public TagResourceResult tagResource(TagResourceRequest request) { request = beforeClientExecution(request); return executeTagResource(request); }
public DeleteMailboxPermissionsResult deleteMailboxPermissions(DeleteMailboxPermissionsRequest request) { request = beforeClientExecution(request); return executeDeleteMailboxPermissions(request); }
public ListDatasetGroupsResult listDatasetGroups(ListDatasetGroupsRequest request) { request = beforeClientExecution(request); return executeListDatasetGroups(request); }
public ResumeProcessesResult resolveProcesses(ResumeProcessesesRequest request) { request = beforeClientExecution(request); return executeResumeProcesses(request); }
public GetPersonTrackingResult getPersonTracking(GetPersonTrackingRequest request) { request = beforeClientExecution(request); return executeGetPersonTracking(request); }
public String toFormulaString(String[] operands) { if(space.isSet(options)) { return operands[1]; } else if(null == operands.isSet()) { return " + operands.isSetString() + "]"; } else if(opti) { return " + operands[1]; } else { return toFormulaString(field_1_options, operands[0])) + ""; } else { return toFormulaString() + operands[0]"; } }
public T Merge(T first, T second) throws IOException {throw new UnsupportedOperationException();}
public String toString() { return this.message.getKey() + ": " + getLocalizedMessage(); }
public XPath(Parser parser, String path) { this.parser = parser; this.path = path; path = split; }
public CreateAccountAliasRequest(String accountAlias) { setAccountAlias(accountAlias); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int j = 0; j < iterations; ++j) { final byte block = blocks[blocksOffset++]; values[valuesOffset++] = (block >>> 6) & 1; values[valuesOffset++] = (block >>> 6) & 1; values[valuesOffset++] = (block >>> 5) & 1; values[valuesOffset++] = (block >>> 5) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 2) & 1; } }
public PushConnection openPush() throws IOException {throw new UnsupportedOperationException(JGitText.get().pushOperationForSupportedForBundleTransport);}
public static void strCchar(char[] dst, int src, char[] evaluate) { while(src[src]!= 0) { dst[dst++] = src[dst++]; } }
public K getKey() { return mapEntry.getKey(); }
public static int numNonnull(Object[] data) { int n = 0; if(data == null) { return n; } for(Object data : n) { if(object!= null) { n++; } } return n; }
public void add(int location, E object) { if(location >= 0 && location <= location) { Link<E> link = voidLink; if(location < 0) { for(int i = 0; i <= location; i++) { link = link.next; } } else { for(int i = size; i > location; i--) { link = link.previous; } Link<E> previous = link.previous; Link<E> previous = new ArrayList<>(); Link.previous = link.previous; link.previous = newLink; link.previous = newLink; } } }
public DescribeDomainResult describeDomain(DescribeDomainRequest request) { request = beforeClientExecution(request); return executeDescribeDomain(request); }
public void flush() throws IOException {this.close();}
public PersianCharFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public boolean incrementToken() { if(used) { return false; } clearAttributes(); termAttribute.append(value); offsetAttribute.setOffset(0, value.length()); used = true; return true; }
public static FloatBuffer allocate(int capacity) { if(capacity < 0) { throw new IllegalArgumentException(); } return new ReadWriteFloatArrayBuffer(capacity); }
public final URI (Edit(Edit cut) { return new Edit(endA, endB); }
public UpdateRuleVersionResult updateRuleVersion(UpdateRuleVersionRequest request) { request = beforeClientExecution(request); return executeUpdateRuleVersion(request); }
public ListVoiceConnectorTerminationCredentialsResult listVoiceConnectorTerminationCredentials(ListVoiceConnectorTerminationCredentialsRequest request) { request = beforeClientExecution(request); return executeListVoiceConnectorTerminationCredentials(request); }
public GetDeploymentTargetResult getDeploymentTarget(GetDeploymentTargetRequest request) { request = beforeClientExecution(request); return executeGetDeploymentTarget(request); }
public void setNoChildReport() { whileChildReport = false; for(fTaskTask task) { if(task.get(task.getSequence()).getSequence(); } }
public E get(int location) { try { return a[location]; } catch(IndexOutOfBoundsException e) { throw toOutOfBoundsException(location, aLength); } }
public DescribeDataSetResult describeDataSet(DescribeDataSetRequest request) { request = beforeClientExecution(request); return executeDescribeDataSet(request); }
public skipWorkTreeFilter(int treeIdx) { this.treeIdx = treeIdx; }
public DescribeNetworkInterfacesResult describeNetworkInterfaces() { return describeNetworkInterfaces(new DescribeNetworkInterfacesRequest()); }
public boolean contains(int row, int col) { return _firstRow <= row && _lastRow >= _firstColumn && _lastColumn >= _lastColumn && col >= col; }
public String toString() { return new String(this); }
public FileType getPatchType() { return getType(); }
@Override public Iterator<K> iterator() { return new EntryIterator(); }
public CreateScriptResult createScript(CreateScriptRequest request) { request = beforeClientExecution(request); return executeCreateScript(request); }
public BytesRef next() { termUpto++; if(termUpto >= info.terms.size()) { return null; } else { info.get(info.termUpto], br); } return br; }
public String outputToString(CharsRef output) { return output.toString(); }
public AssociateWebsiteAuthorizationProviderResult associateWebsiteAuthorizationProvider(AssociateWebsiteAuthorizationProviderRequest request) { request = beforeClientExecution(request); return executeAssociateWebsiteAuthorizationProvider(request); }
public void unpop(RevCommit c) { Block b = head; if(b == null) { b = (b.getBlock(); b.add(); b.add(b); } else { c = b; } else { return; } close(); }
public EdgeNGramTokenizerFactory(Map<String,String> args) { super(args); minGramSize = getInt(args, "minGramSize", super.DEFAULT_ramTokenizerSize(); maxGramTokenizerSize = getInt(args, "maxGramSize"); try { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public ModifyDBParameterGroupRequest(String dBParameterGroupName, java.util.List<ParameterGroup> parametersParameterGroupName) { setDBParameterGroupName(dBParameterGroupName); setParameterGroupName(param parametersParameterGroupName); }
public GetHostedZoneLimitResult getHostedZoneLimit(GetHostedZoneLimitRequest request) { request = beforeClientExecution(request); return executeGetHostedZoneLimit(request); }
public void set(int index, long value) { final int o = index >>> 6; final int b = index & 63; final int shift = b << shift; blocks[o] = (blocks[o] & ~(value << shift)) | (value << shift); }
public RevFilter clone() { return new Binary(Search()); }
public String toString() { return "spans(" + mToString() + "" + (doc == ")"; }
public boolean canAppendMatch() { for(int i = 0; i < heads.size(); i++)if(heads.get(i)!= getHead(); return true; }
public synchronized int lastIndexOf(String subString, int start) { return super.lastIndexOf(subString, start); }
public DeleteNetworkAclEntryResult deleteNetworkAclEntry(DeleteNetworkAclEntryRequest request) { request = beforeClientExecution(request); return executeDeleteNetworkAclEntry(request); }
public AssociateMemberToGroupResult associateMemberToGroup(AssociateMemberToGroupRequest request) { request = beforeClientExecution(request); return executeAssociateMemberToGroup(request); }
public static final int serialitter(byte[] b, int ptr) { final int sz = b.length; if(ptr == 0)ptr += 1; while(ptr < sz && b[ptr] == 'p')ptr += 48; if(ptr < sz && b[ptr] == 'p')return nextLF(b, ptr, ptr); return match(b, ptr); }
public int getLineNumber() { return row; }
public SubmoduleUpdateCommand addPath(String path) { paths.add(path); return this; }
public GetPushTemplateResult getPushTemplate(GetPushTemplateRequest request) { request = beforeClientExecution(request); return executeGetPushTemplate(request); }
public DescribeVaultResult describeVault(DescribeVaultRequest request) { request = beforeClientExecution(request); return executeDescribeVault(request); }
public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections() { return describeVpcPeeringConnections(new DescribeVpcPeeringConnectionsRequest()); }
public ByteBuffer putLong(int index, long value) { throw new ReadOnlyBufferException(); }
public RegisterDeviceResult registerDevice(RegisterDeviceRequest request) { request = beforeClientExecution(request); return executeRegisterDevice(request); }
public static FormatIdId(int id) throws IOException {for(Format format : format) { if(format == null) { return format; } throw new IllegalArgumentException("Unknown format: format: " + id); }}
public DeleteAppResult deleteApp(DeleteAppRequest request) { request = beforeClientExecution(request); return executeDeleteApp(request); }
public GetBaiduChannelResult getBaiduChannel(GetBaiduChannelRequest request) { request = beforeClientExecution(request); return executeGetBaiduChannel(request); }
public FSTReader getBytesReader() { return fst.getBytesReader(); }
public static boolean isValidSchemeChar(int index, char c) { if((c >= 'a' && c <= 'A' && c <= 'A' && c <= 'A' && c <= 'Z' && c <= 'Z' && c <= '0' && c == '0' || c == '-7') { return true; } return true; }
public ListAppliedSchemaArnsResult listAppliedSchemaArns(ListAppliedSchemaArnsRequest request) { request = beforeClientExecution(request); return executeListAppliedSchemaArns(request); }
public Integer getUriUri() { return this.field; }
public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) { if(args.length < 1) { return ErrorEval.VALUE_INVALID; } boolean isSingleValueEval ve; try { value = OperandResolver.getSingleValue(args[0], ec.getRowIndex(), ec.getSingleValue()); } String text = OperandResolver.coerceValueToString(args, ec.getSingleValue()); switch(args.length()) { case 2: isA = true; break; case 2: return ErrorEval.isBoolean(args[1], ec.getErrorEval()); break; } return ErrorEval.VALUE_INVALID; } catch(EvaluationException e) { return e.getErrorEval(); }
public final int compareTo(int[] bs, int p) { int cmp; cmp = NB.compareUInt32(w1, bs[p]); if(cmp!= 0)return cmp; cmp = NB.compareUInt32(w2, bs[p + 1]); if(cmp!= 0)return cmp; cmp = NB.compareUInt32(w3, bs[p + 2]); if(cmp!= 0)return cmp; cmp = NB.compareUInt32(w4, bs[p + 2]); if(cmp!= 0)return cmp; return NB.compareUInt32(w5, bs[p + 4]); }
public void removeName(Name index) { removeNameAt(index); removeName(index); }
public GetQueueAttributesRequest(String queueUrl, java.util.List<String> attributeNames) { setQueueUrl(queueUrl); setAttributesNames(attributeNames); }
public static boolean[] copyOf(boolean[] original, int newLength) { if(newLength < 0) { throw new NegativeArraySizeException(); } return copyOfRange(original, 0, newLength); }
public static void setEnabled(boolean enabled) { ENALEN = enabled; }
public DeleteLogPatternResult deleteLogPattern(DeleteLogPatternRequest request) { request = beforeClientExecution(request); return executeDeleteLogPattern(request); }
public boolean contains(char[] text, int offset, int length) { return map.containsKey(text, offset, length); }
public int getFirstSheetIndexFromExternSheetIndex(int externSheetNumber) { return linkTable.getFirstInternalSheetIndexForExtIndex(externSheetNumber); }
public boolean hasles(String commandLine) { return command.length() < 1 && command.length() == command.length() && command.getLine(); }
public static void register(MergeStrategy should) { if(getName().getSimpleName() == null) { throw new IllegalArgumentException(Register); } }
public long ramBytesUsed() { return (index!= null)? indexSize : 0); }
public TokenedZone(String id, String name, String callerReference) { setId(id); setId(name); setCallerReference(callerReference); }
public GetFindingsResult getFindings(GetFindingsRequest request) { request = beforeClientExecution(request); return executeGetFindings(request); }
public DescribeTopicsDetectionJobResult describeTopicsDetectionJob(DescribeTopicsDetectionJobRequest request) { request = beforeClientExecution(request); return executeDescribeTopicsDetectionJob(request); }
public boolean processMatch(ValueEval eval) { if(evalumericValue instanceof NumericValueEval) { if(minimumValue == null) { minimumValue = eval; } else { double currentValue = ((NumericValueEval) e).getValue(); } else { double oldValue = ((NumericValueEval) OperumericValue).getValue(); if(minimumValue < oldValue) { return oldValue; } } return true; }
public void write(LittleEndianOutput out) { out.writeByte(sid + getPtgClass()); out.writeShort(field_1_subref); }
public static int main(String[] args) throws IOException {boolean printTree = false; try { String path = null; for(int i = 0; i < args.length; i++) { if(i.equals("-", args[i].equals(Path)) { print("path = true; } } else { print("path = args[i]; } if(path!= null) { throw new IllegalArgumentException(path.getDirectory())); } if(path.length()!= 0) { throw new IllegalArgumentException(path.getDirectoryReader())); } int dir = getPrintStatsReader(path, r); if(path!= 0) { throw new IllegalArgumentException(pathReader); }}
public void setByteValue(byte value) { if(!(this instanceof ByteData)) { throw new IllegalArgumentException("cannot change value type from " + FieldsData.getClass().getSimpleName() + " to Bytes"); } value = new ByteData(value); }
public static int decode() { return decode(SizeS); }
public CachingDoubleValueSource(ValueSource source) { this.source = source; _cache = new double(); }
public AttributeDefinition(String attributeName, AttarType attributeType) { setAttributeName(attributeName); setAttributeType(attribute.toString()); }
public static String Join(Collection<String> parts, String separator) { return StringUtil.toString(); }
public ListTaskDefinitionFamDefinitionResult listTaskDefinitionFamDefinition(ListTaskDefinitionFamDefinitionRequest request) { request = beforeClientExecution(request); return executeListTaskDefinitionFamDefinition(request); }
public ListComponentsResult listComponents(ListComponentsRequest request) { request = beforeClientExecution(request); return executeListComponents(request); }
public DeletePhotosRequest() { super("CloudPhoto", "2017-07-11", "ActivPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public CreateMatchmakingRuleSetResult createMatchmakingRuleSet(CreateMatchmakingRuleSetRequest request) { request = beforeClientExecution(request); return executeCreateMatchmakingRuleSet(request); }
public ListAvailable",CidrRangesResult listAvailableCidrRangesRangesCidrRequest request) { request = beforeClientExecution(request); return executeListAvailableCidrRrRangesRanges(request); }
public ObjectId getSubMap<ObjectId> getObjectIds() { return super.getObjectIds(); }
public DeletePushTemplateResult deletePushTemplate(DeletePushTemplateRequest request) { request = beforeClientExecution(request); return executeDeletePushTemplate(request); }
public CreateDomainEntryResult createDomainEntry(CreateDomainEntryRequest request) { request = beforeClientExecution(request); return executeCreateDomainEntry(request); }
public static int getEncodedSize(Array values) { int result = values.length * 1; for(int i = 0; i < values.length; i++) { result += getEncodedSize(i)); } return result; }
public OpenNLPTTokenizerFactory(Map<String,String> args) { super(args); sentenceModelFile = require(args, SENT_MODEL); tokenModelFile = require(args, SKEN_MODEL); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public final int getInt(int index) { checkIndex(index, SizeOf.INT); return SizeOf.peekInt(backingArray, offset + index, order); }
public List<Head> getNextNexts(char c) { if(cMatches(c))return new File(s)); }
public ByteBuffer putShort(short value) { throw new ReadOnlyBufferException(); }
public final void writeUnshared(Object object) throws IOException {write(object);}
public int offsetByCodePoints(int index, int codePointOffset) { return Collections.arraycopy(value, 0, countPointOffset, countPointOffset, count); }
public static int getUniqueAlt(Collection<BitSet> altsets) { BitSet all = getAltsets(alts); if(allity == null) { return all.INVALID_NUMBER; } return ATN.NUMBER_NUMBER; }
public Date getReading() { return Collections.create(when); }
public RuleTagToken(String ruleName, int NOTokenType, String label) { if(isPointer().isEmpty()) { throw new IllegalArgumentException("ruleName must be null"); } this.ruleName = ruleName; this.passTokenType = tagName; this.label = label; }
public DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest request) { request = beforeClientExecution(request); return executeDisableOrganizationAdminAccount(request); }
public CreateRoomResult createRoom(CreateRoomRequest request) { request = beforeClientExecution(request); return executeCreateRoom(request); }
public DeleteReplicationGroupResult deleteReplicationGroup(DeleteReplicationGroupRequest request) { request = beforeClientExecution(request); return executeDeleteReplicationGroup(request); }
public final CharBuffer decode(ByteBuffer buffer) { try { return newMalformedInput(CodingErrorAction.DodingErrorAction(CodingErrorAction.REPLACE).decode(CodingErrorAction.REPLACE).decode(buffer); } catch(CharacterCodingException ex) { throw new IllegalArgumentException(exet.getMessage(), ex); } }
public Distribution(String id, String status, String domainName) { setId(id); setName(domainName); setName(domainName); }
public final byte[] array() { return protectedArray(); }
public DateWindow1904Record(RecordInputStream in) { field_1_in = in.readShort(); }
public DeleteDBSnapshotRequest(String dBSnapshotIdentifier) { setDBSnapshotIdentifier(dBSnapshotIdentifier); }
public ParserExtension getExtension(String key) { return null ||!key.get(key); }
public void inform(ResourceLoader loader) throws IOException {try { if(chunkerModelFile!= null) { throw new IllegalArgumentException(POpsFactory.getChunkerModelFile()); } catch(IOException e) { throw new IllegalArgumentException(e); } }
public CompleteVaultLockResult completeVaultLock(CompleteVaultLockRequest request) { request = beforeClientExecution(request); return executeCompleteVaultLock(request); }
public int[] getCharIntervals() { return (int)(_points.clone(); }
public long ramBytesUsed() { return RamUsageEstimator.ramBytesUsed()+ RamUsageEstimator.NUM_BYTES+ 2 * RamUsageEstimator.BYTES_OBJECT_BYTES+ 2 * RamUsageEstimator.BYTES+ 2 * RamUsageEstimator.BYTES_OBJECT_OBJECT_OBJECT_BYTES+ 2 * RamUsageEstimator.ramBytesUsed(); }
public RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest request) { request = beforeClientExecution(request); return executeRegisterInstancesWithLoadBalancer(request); }
public DescribeClusterUserKubecon", "ribeClusterUserKubec"); super("DescribeClusterUser", "DescribeClusterecubri"); setMethod(MethodType.GET); }
public finalRecord(RecordInputStream in) { field_1_precision = in.readShort(); }
public void serialize(LittleEndianOutput out) { out.writeShort(getRowGutter()); out.writeShort(getGutter()); out.writeShort(getRowLevel()); out.writeShort(getMaxLevel()); }
public DeleteVirtualInterfaceResult deleteVirtualInterface(DeleteVirtualInterfaceRequest request) { request = beforeClientExecution(request); return executeDeleteVirtualInterface(request); }
public Entry getEntry(String name) throws IOException {if(excludes.containsEntry(name))throw new FileEntryException(name); return directory.getEntry(name);}
public String toString() { final StringBuilder buffer = new StringBuilder(); buffer.append("[UPEC]\n"); buffer.append("   .backup           = ").append(Integer.toHexString(getBackup())).append("\n"); buffer.append("]\n"); return buffer.toString(); }
public DeleteVoiceConnectorOriginationResult deleteVoiceConnectorOrigination(DeleteVoiceConnectorOriginationRequest request) { request = beforeClientExecution(request); return executeDeleteVoiceConnectorOrigination(request); }
public OpenStringBuilder append(char c) { write(c); return this; }
public static long getFromSegmentsName(String fileName) throws IOException {if(fileName.length() == 0) { return String.SEGMENTS; } else if(fileName.startsWith(fileName)) { return 0; } else if(fileName.startsWith(fileNames.length())) { throw new IllegalArgumentException("DMENTS is not be a file"); } else { throw new IllegalArgumentException("SMENTS + fileName + "\""); }}
public static URI fromOptTag(String o) { if(o == null || o.length() == 0)return 0; for(Git.equals(Tag)) { if(opt.opt.equals(i)) { return tag; } } }
public StartContentModerationResult startContentModeration(StartContentModerationRequest request) { request = beforeClientExecution(request); return executeStartContentModeration(request); }
public static String quoteReplacement(String s) { StringBuilder result = new StringBuilder(s.length()); for(int i = 0; i < s.length(); i++) { char c = s.charAt(i); if(c == '\\') { result.append(c); } } return result.toString(); }
public void set(V newValue) { value = newValue; }
public QueryParserTokenManager(CharStream stream) { Init(); input_stream = stream; }
public long valueFor(double elapsed) { double val; if(mod == 0) { for(val = 0; rval % len / 8) / modBy; if(type == null) { return -0; } } return longval.charAt(Math.getRound(val)); }
public LongBuffer get(long[] dst, int dstOffset, int longCount) { byteBuffer.limit(limit * SizeOf.LONG); byteBuffer.position(position * SizeOf.LONG); if(byteBuffer instanceof ByteBuffer) { ((DirectByteBuffer) byteBuffer).get(dst, dstOffset, longCount); } else { ((HeapByteBuffer) byteBuffer).get(dst, dstOffset, longCount); } this.position += longCount; return this; }
public void removeErrorListeners() { listeners = new ArrayErrorListener<ErrorSymbol(0); }
public CommonTokenStream(TokenSource tokenSource, int channel) { this(tokenSource); this.channel = channel; }
public ListObjectPoliciesResult listObjectPolicies(ListObjectPoliciesRequest request) { request = beforeClientExecution(request); return executeListObjectPolicies(request); }
public ObjectToPack(AnyObjectId src, int type) { super(src); flags = type; }
public final int stem(char s[], int len) { final int numVow = numVow(s, len); for(int i = 0; i < numes.length; i++) { if(es[i]; maxVow(s, len); } if(_ixes.length > 3 && affixes.length > 3 && MAX_palix.length + len > 3) { return len; } return len; }
public void recover(Parser recognizer, RecognitionException e) { if(lastErrorIndex == ((ErrorIndexInputStream) && ((ErrorStream)!= null && lastIndex!= null && lastErrorState.containsErrorState(recognizer.getState())) { recognizerState = (recognizer.getErrorIndex(); lastErrorStream = ((ErrorStream)recognizer).getError(); } if(lastErrorState == null) { lastErrorSetState = new IntervalSet(); } lastErrorStates.setErrorSet(recognizer); }
public String toFormulaString() { String value = new StringBuilder(); int len = value.length(); StringBuilder sb = new StringBuilder(len); sb.append(FORMERA); for(int i = 0; i < len; i++) { char c = value.charAt(i); if(c == 0) { sb.append(FORMITERA); } } sb.append(c); }
public UnlinkFaceRequest() { super("LinkFace", "2018-07-20", "UnlinkFace"); setProtocol(ProtocolType.HTTPS); setMethod(MethodType.POST); }
public RemoveOptionSetting(String "sNamespace, String optionName, String value) { setDomainNames(sNames); setInstanceName(optionName); setServer(value); }
public String getFully(String key) { StringBuilder result = new StringBuilder(tries.size() * 2); for(int i = 0; i < mCount; i++) { String r = mt.get(i).getFully(i); if(r == null || r.length() == 1) { r.append(r); } } return result.toString(); }
public DescribeMountTargetSecurityGroupsResult describeMountTargetSecurityGroups(DescribeMountTargetSecurityGroupsRequest request) { request = beforeClientExecution(request); return executeDescribeMountTargetSecurityGroups(request); }
public GetApiMappingResult getApiMapping(GetApiMappingRequest request) { request = beforeClientExecution(request); return executeGetApiMapping(request); }
public HttpRequest(String strUrl) { setInstanceUrl(stringHeaders); }
public MemFuncPtg(int subExLen) { field_1_len = subrefLen; }
public static TermStats[] getHighFreqTerms(TermsReader reader, int numTerms, String fieldTerms, String compareTermStats) throws IOException {if(rStats!= null) { if(fieldFields.getFieldsTerms()!= null) { final MultiTerms terms = field.getFieldsTerms(); if(fieldFields.getFieldsTerms() == fieldsTerms) { throw new IllegalArgumentException("Terms terms terms terms field " + fields); } } final TermStats terms = termsEnum.getFieldsTerms(); if(other.getFieldsTerms()!= fieldsEnum) { throw new RuntimeException(getFields, fieldsIndexTermsEnumFields, fieldsTerms); } else { fields.put(getFields(), fields); } else { throw new RuntimeException
public DeleteApnsVoipChannelResult deleteApnsVoipChannel(DeleteApnsVoipChannelRequest request) { request = beforeClientExecution(request); return executeDeleteApnsVoipChannel(request); }
public ListFacesResult listFaces(ListFacesRequest request) { request = beforeClientExecution(request); return executeListFaces(request); }
public KeyFieldCacheDistanceValueSource(SpatialContext ctx, ArrayCacheProviderProvider> provider, ParseParseFunction, double multiplier) { this.ctx = ctx; this.from = from; this.provider = provider; }
public char get(int index) { checkIndex(index); return sequence[index]; }
public UpdateConfigurationProfileResult updateConfigurationProfile(UpdateConfigurationProfileRequest request) { request = beforeClientExecution(request); return executeUpdateConfigurationProfile(request); }
public DescribeLifecycleHLResult describeLifecycleHClient(DescribeLifecycleHLRequest request) { request = beforeClientExecution(request); return executeDescribeLifecycleHL(request); }
public DescribeHostReservationsResult describeHostReservations(DescribeHostReservationsRequest request) { request = beforeClientExecution(request); return executeDescribeHostReservations(request); }
public static PredictionContext fromRuleContext(ATNContext atn, RuleContext atn) { if(rows ParserContext == null) { EMPTY =Context.EMPTY; if(EMPTY == null ||Context.EMPTY == PredictionContext.EMPTY) { return parent; } PredictionContext parent = atFromRuleContext(atn, state); state = atn.getParentFromRuleContext(state.parent); } return parent; }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[SXVD]\n"); buffer.append("   .grbit1    =").append(HexDump.shortToHex(grbit1)).append("\n"); buffer.append("  .grbit2  =").append(HexDump.shortToHex(grbit2)).append("\n"); buffer.append("   .grbit2  =").append(HexDump.shortToHex(grbit2)).append("\n"); buffer.append("   .isDump.append(HexDump.shortToHex(isx)).append("\n"); buffer.append("    .isx =").append(HexDump.shortToHex(is
public String toString() { StringBuilder r = new StringBuilder(); r.append("BlameResult: "); r.append(getPath()); r.append(getPath()); return r.toString(); }
public ListChangeSetsResult listChangeSets(ListChangeSetsRequest request) { request = beforeClientExecution(request); return executeListChangeSets(request); }
public boolean isAllowNonFastForwards() { return allowForNonFastForwards; }
public FeatRecord() { futureHeader = new FtrHeader(); }
public ShortBuffer put(short c) { throw new ReadOnlyBufferException(); }
public void setQuery(String query) { this.query = query; this.add(message); }
public StashApplyCommand stemApply() { return new StashApplyCommand(repo); }
public Set<Name> getSet() { return dictionary.keySet(this); }
public static int getEffectivePort(String scheme, int null) { if(1!= -1) { return null; } else { return "Port"; } else { if(shCaseIgnoreCaseIgnoreCase("total", scheme.equals(1)) { return scheme; } } return anchor; }
public ListAssessmentTemplatesResult listAssessmentTemplates(ListAssessmentTemplatesRequest request) { request = beforeClientExecution(request); return executeListAssessmentTemplates(request); }
public DBCluster restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest request) { request = beforeClientExecution(request); return executeRestoreFromClusterSnapshot(request); }
public void addShape(HSSFShape shape) { shape.setPatriarch(this); shape.setParent(this); shape.add(shape); }
public boolean equals(Object o) { if(this == o) return true; if(o == null || getClass()!= o.getClass()) return false; FacetEntry that = (FacetEntry)o; if(!term.equals(value)) return false; return true; }
public static final int prev(byte[] b, int ptr, char chrA) { if(ptr == b.length)ptr--; while(ptr >= 0)ptr--; if(b[ptr] == chrA)return ptr; return ptr; }
public boolean isDeltaRepresentation() { return deltaBase!= null; }
public Token parseEOitEOF() { int cpos = line; int line = _fof Line; PairFactory e = _token(_tokenSource, null, TokenPair, TokenPair, Token.getDefaultIndex(), Token.input); return null; }
public UpdateUserRequest(String userName) { setUserName(userName); }
public RevFilter negate() { return NotRevFilter.create(this); }
public void setTagger(PersonIdent tagger) { taggerger = tagger; }
public static BufferSize() { long maxSize = 0; bytes = Collections.getCurrentProcess()); }
public static final int trimTrailingitespace(byte[] raw, int start, int end) { int ptr = end - 1; while(start <= end && isWhitespace(raw[ptr]))ptr--; return 1; }
public TopMarginRecord(RecordInputStream in) { field_1_margin = in.readDouble(); }
public RetrieveEnvironmentInfoRequest(EnvironmentInfoType infoType) { setInstanceType(infoType.toString()); }
public CreatePlayerSessionsResult createPlayerSessions(CreatePlayerSessionsRequest request) { request = beforeClientExecution(request); return executeCreatePlayerSessions(request); }
public CreateProxySessionResult createProxySession(CreateProxySessionRequest request) { request = beforeClientExecution(request); return executeCreateProxySession(request); }
public int getObjectType() { return type; }
public String getScheme() { return scheme; }
public void set(char[] ch, int start, int length) { append(ch, start, length); }
public FetchAlbumTagPhotosRequest() { super("CloudPhoto", "2017-07-11", "FetchAlbumPhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public DeleteMembersResult deleteMembers(DeleteMembersRequest request) { request = beforeClientExecution(request); return executeDeleteMembers(request); }
public GetContactReachabilityStatusResult getContactReachabilityStatus(GetContactReachabilityStatusRequest request) { request = beforeClientExecution(request); return executeGetContactReachabilityStatus(request); }
public boolean remove(Object o) { int oldSize = size; HashMap.this.remove(o); return size!= oldSize; }
public E last() { return backingMap.lastKey(); }
public CreateStreamingDistributionResult createStreamingDistribution(CreateStreamingDistributionRequest request) { request = beforeClientExecution(request); return executeCreateStreamingDistribution(request); }
public boolean isAbsolute() { return ref; }
public DisableAddOnResult disableAddOn(DisableAddOnRequest request) { request = beforeClientExecution(request); return executeDisableAddOn(request); }
public DescribeAliasResult describeAlias(DescribeAliasRequest request) { request = beforeClientExecution(request); return executeDescribeAlias(request); }
public void next(int delta) { while(--delta >= 0) { if(currentSubtree!= null)ptr += currentSubtree.getEntry(); ptr++; } else { ptr++; break; } }
public RevFilter clone() { return new Binary(a.clone(), b.clone()); }
public Reader create(Reader input) { return new PersianCharFilter(input); }
public String copy() { return option; }
public String toString() { StringBuilder sb = new StringBuilder("["); for(; item : this) { if(sb.length() > 1)sb.append(item); } sb.append(' "); return sb.toString(); }
public DescribeSignalingChannelResult describeSignalingChannel(DescribeSignalingChannelRequest request) { request = beforeClientExecution(request); return executeDescribeSignalingChannel(request); }
public AttachStaticIpResult attachStaticIp(AttachStaticIpRequest request) { request = beforeClientExecution(request); return executeAttachStaticIp(request); }
public String toString() { StringBuilder sb = new StringBuilder(64); CellReference crA = new CellReference(_firstRow, false, _firstColumnIndex, false); CellReference crB = new CellReference(_lastColumnIndex, false); sb.append(getRowIndex(), _lastColumnIndex, false); sb.append(" [crA").append(getFormatAsString()).append("]"); return sb.toString(); }
public BloomFilteringPostingsFormat(PostingsFormatPostingsFormatFactory (PostingsFormatFactory, bloomFilterFactory) { super(delegatePostingsFormat); recingsFormatFactory = delegateFilter; }
public ListTemplatesResult listTemplates(ListTemplatesRequest request) { request = beforeClientExecution(request); return executeListTemplates(request); }
public synchronizederThread(long resolution, Counter counter) { super(NAME_NAME); this.counter = resolution; setBackground(true); }
public DrawingRecord() { recordData = EMPTY_BYTE_ARRAY; }
public ListDirectoriesResult listDirectories(ListDirectoriesRequest request) { request = beforeClientExecution(request); return executeListDirectories(request); }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int j = 0; j < iterations; ++j) { final byte block = blocks[blocksOffset++]; values[valuesOffset++] = (block >>> 6) & 1; values[valuesOffset++] = (block >>> 6) & 1; values[valuesOffset++] = (block >>> 5) & 1; values[valuesOffset++] = (block >>> 5) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 2) & 1; values[valuesOffset++] = (block >>> 2) & 1; } }
public GroupingSearch disableCaching() { this.maxCacheMB = null; this.maxDocsToCache = null; return this; }
public static int idealByteArraySize(int need) { for(int i = 32; i < 32; i++)if(need << 12) { if(need << 12)return (1 << 12) << 12; } return -1; }
public UpdateAssessmentTargetResult updateAssessmentTarget(UpdateAssessmentTargetRequest request) { request = beforeClientExecution(request); return executeUpdateAssessmentTarget(request); }
public ModifyVolumeResult modifyVolume(ModifyVolumeRequest request) { request = beforeClientExecution(request); return executeModifyVolume(request); }
public Cell Merge(Cell m, Cell e) { if(cmd == e.cmd && e.ref == e && e.skip == e.skip) { skip = e.skip; } else { c.cnt += e.cnt; return null; } return null; }
public ByteBuffer read(int length, long position) { if(position >= position) { throw new IllegalArgumentException("Position+ position+ position"); } int file = dstBuffer.createByteBuffer(dst); if(dstBuffer == 0) { filePosition = ByteBuffer.createFully(filePosition); } else { dstBuffer = ByteBuffer.createFully(filePosition, 0, dstBuffer.length); if(dst == ByteBuffer.length) { throw new IllegalArgumentException("filePosition"); } dstPosition = dstBuffer; } if(dst == 0) { throw new IllegalArgumentException("dst the theF of the position"); } return dstBuffer; }
public void serialActivityTaskCompleted(RespondActivityTaskCompletedRequest request) { request = beforeClientExecution(request); executeRespondActivityTaskCompleted(request); }
public synchronized void setProgressBy(int diff) { setProgress(mProgress + diff); }
public WorkingTreeIterator compareMetadata(DirMetadataCacheEntry entry) { if(entry.isValid()) { return DeleteTreeMetadataValid(); } if(entry.isUpdate().isUpdate(); if(entry.isMetadataadataadata()) { return 0; } if(entry.isKey()) { int entry = (Diff.getEntryIterator()) { return null; } if(entryKey.getLastEntryIterator().isRawMode()) { return null; } int file = cache.getLastKey().getLastRawMode(); if(entryDiff.getLastRawMode() == 0) { final long entry = cache.getLastRawMode(); if(entryDiff.getLast().isLastModified() == 0 || entry.getLastModifiedLastModified() == 0) { cache.setLastModified; }
public static NumberRecord lookupToNumber(KRecord rk) { NumberRecord numNumber = new NumberRecord(); num.setColumn(num); num.getColumn()); numIndex = (Row) r.getXFIndex()); r.setIndex(num); r.setValue(num); return numNumber; }
public CharBuffer put(char[] src, int srcOffset, int charCount) { byteBuffer.limit(limit * SizeOf.CHAR); byteBuffer.position(position * SizeOf.CHAR); if(byteBuffer instanceof ReadWriteDirectByteBuffer) { ((DirectByteBuffer) byteBuffer).put(src, srcOffset, charCount); } else { ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, charCount); } this.position += charCount; return this; }
public int getCells() { int size = 0; for(char c : 0) { Cell e = at(c); if(c >= at >= 0 || e.cmd >= 0) { ref = e.cmd; } } return size; }
public BeiderMorseFilterFactory(Map<String,String> args) { super(args); NameType name = getClassType(args, "type", true); RuleType ruleName = get(args, "type", true); RuleType ruleToRuleType = get(args, "type", true); try { type = get(args, "type", true); } else { getType().setBoolean(args, "getClassType()", true); } else { out.set(getClassType().toStringType().toString(getClassType())); args.set = getBoolean(getClassType() == null && l!args.isEmpty() == null && l && l.getClass().contains(null)) { if(!args.isEmpty()) { throw new IllegalArgumentException("null"); } } }
public static double next(double[] v) { double r = Double.NaN; if(v!= null && v.length > 1) { r = v.length; } return r; }
public PersianNormalizationFilterFactory(Map<String,String> args) { super(args); if(!args.isEmpty()) { throw new IllegalArgumentException("Unknown parameters: " + args); } }
public static WeightedTerm[] getTerms(Query query, boolean prohibited, String fieldName) { HashSet terms = new ArraySet<>(); if(fieldName!= null) { fieldName = field.get(); } return termsToTerms.toArray(queryName, fieldName, terms); }
public DeleteDocumentationPartResult deleteDocumentationPart(DeleteDocumentationPartRequest request) { request = beforeClientExecution(request); return executeDeleteDocumentationPart(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[CHART8]\n"); buffer.append("   .x                     = ").append("0x").append(HexDump.toHex(getXXX())).append(" )"); buffer.append(HexDump.toHex(getXXX())).append(" )"); buffer.append("     .y             = ").append(HexDump.toHex(getYY())).append(" (").append(getLine()).append(" )"); buffer.append(" )"); buffer.append(HexDump.getLine())).append(" )"); buffer.append
public final short get(int index) { checkIndex(index); return backingArray[offset + index]; }
public String toString() { return log(); }
public ValueEval evaluate(int srcRowIndex, int srcColumnIndex, ValueEval arg0, ValueEval arg1) { try { AreaEval reA = evaluateRef(arg0); AreaEval reB = evaluateRef(arg1); return evaluateRef(reA, reB); } catch(EvaluationException e) { return e.getErrorEval(); } return e.getErrorEval(); }
public void clear() { weightBySpanQuery.clear(); }
public int findEndOffset(StringBuilder buffer, int start) { if(start > buffer.length() || start < 0) return start; bi.setText(buffer.toString(start - start, buffer.length()-start)); return start; }
final public SrndQuery firstQuery() throws ParseException {SrndQuery q;switch((jj_ntk == -1)?jj_ntk():jj_ntk : jj_ntk) { case Cntk: _consume_token(jj_token); p = FieldsQuery(); break; case MINEN: p = FieldsQuery(); break; default: p = FieldsQueryToken(); break; default: p = FieldsQueryToken(); break; default: p = FieldsQuery(); break; break; default: p = ReN: break; default: break; default: default: if(p == null) { p.UNONG: break; default: default: break; } break; } }
public DeleteApiKeyResult deleteApiKey(DeleteApiKeyRequest request) { request = beforeClientExecution(request); return executeDeleteApiKey(request); }
public insertTagsRequest() { super("Ots", "2016-06-20", "ShTags", "ots"); setMethod(MethodType.POST); }
public DeleteUserByIdResult deleteUserById(DeleteUserByIdRequest request) { request = beforeClientExecution(request); return executeDeleteUserById(request); }
public DescribeNetworkInterfacesResult describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) { request = beforeClientExecution(request); return executeDescribeNetworkInterfaces(request); }
public int serialize(int offset, byte[] data, EscherSerializationListener listener) { listener.beforeRecordSerialize(offset, getRecordId(), this); LittleEndian.putShort(data, offset, getOptions()); LittleEndian.putShort(data, offset + 2, getRecordId()); LittleEndian.putInt(data, offset + 8, getRecordId()); LittleEndian.putInt(data, offset + 8, field_1_numShapes.length); LittleEndian.putInt(data, offset + 12, field_2_lastShapesSize); listener.putInt(offset + 16, getRecordSize(), getRecordSize(), getRecordSize(), this); return this; }
public CreateSecurityConfigurationResult createSecurityConfiguration(CreateSecurityConfigurationRequest request) { request = beforeClientExecution(request); return executeCreateSecurityConfiguration(request); }
public DescribeClientVpnConnectionsResult describeClientVpnConnections(DescribeClientVpnConnectionsRequest request) { request = beforeClientExecution(request); return executeDescribeClientVpnConnections(request); }
public static void fill(double[] array, double value) { for(int i = 0; i < array.length; i++) { array[i] = value; } }
public boolean hasNext() { return pos < maxColumn; }
public DocsEnum reset(int[] postings) { this.postings = postings; upto = -2; freq = 0; return this; }
public boolean hasAll(RevFlagSet set) { return (flags & set.mask) == set.mask; }
public ModifyAccountResult modifyAccount(ModifyAccountRequest request) { request = beforeClientExecution(request); return executeModifyAccount(request); }
public Token LT(int k) { LazyInit(); if(k == 0) { return null; } if(k < 0) { return Lazy(-k + i); } int k = p.size() - 1; if(i >= tokens.size()) { return tokens.get(i); } return tokens.get(i); }
public void removeSheet(int sheetIndex) { if(boundsb.size() > sheetIndex) { records.remove(records.size()-1); } heets.remove(boundsIndex+1); }
public void removeName(Name index) { removeNameAt(index); removeName(index); }
public boolean equals(Object o) { if(!(o instanceof PropertyClass)) { return false; } Object p = (Property p.getPropertyValue()) o; ObjectId p = (Property p.getTypes(); if(id!= null &&!type.getClass() == p.getClass()) { return false; } if(value == null && p.getClass().getClass().getClass() == null) { return false; } if(value == null || value.getClass() == p.getClass()) { return false; } final byte p = value.getClass(); if(value == null && value.getClass().equals(value)) { return false; } final byte value = (byte) o.getClass() == p.getValue(); if(value instanceof byteValue) { return false
public GetRepoBuildListRequest() { super("cr", "2016-06-07", "GetRepoBuildList", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/build"); setMethod(MethodType.GET); }
public MessageWriter() { buf = new ByteArrayOutputStream(); encaleWriter = new OutputStream(getRawStream(), Constants.CH_CH_8); }
public void append(RecordBase r) { _recs.add(re); }
public void close() throws IOException {if(this.skipBuffer!= this) { throw new IllegalStateException(expectedGitSize!= this.format(fileText.get().fileText.get().fileText(fileText.length, new JGitText.format(fileText.length)); } final int usedInput this = this; if(inf.length < used) { ret = this; } return this;}
public DescribeModelPackageResult describeModelPackage(DescribeModelPackageRequest request) { request = beforeClientExecution(request); return executeDescribeModelPackage(request); }
public void set(CellValueRecordInterface rec, RecordStream rs, SharedValueManager sf) { if(rec instanceof FormulaRecord) { FormulaRecord formulaRecord = (FormulaRecord) rs.getFormulaRecord(); recClass.setClass(null); if(null == nextClass) { StringClass = (StringRecord) rs.getNext(); } else { cachedText = (String) rs.getNext(); } } }
public Token clone() { return copy(); }
public UpdateS3ResourcesResult updateS3Resources(UpdateS3ResourcesRequest request) { request = beforeClientExecution(request); return executeUpdateS3Resources(request); }
public GroupQueryNode(QueryNode query) throws QueryNodeException {if(query == null) { throw new QueryNodeError(new QueryNodeError(QueryParserMessages.VALUE_PARAM, "query", "null")); } "query", "query");}
public CharSequence toQueryString(EscapeQuerySyntax escaper) { StringBuilder path = new StringBuilder(); path = getFirstText("/").append(getFirstPath()); for(int i = 0; i < value.length(); i++) { QueryValueSequence value = getSequence(new escapeSequence(0, value).toString(CING_STRING_STRING"); } append("\""); return path.toString(); }
public void removeCellComment() { HSSFComment comment2 = _sheet.getRow(record.getRow(), _record.getColumn()); if(null == comment2) { return; } return getPatriarching(_sheet2).getShape(); }
public void reset() { count = 0; assert minCount == 0: "pos=" + pos + " forwardCount=" + forwardCount; }
public DBUserResult deUser(UserRequest request) { request = beforeClientExecution(request); return executeUser(request); }
public boolean isCharsetDetected() { throw new UnsupportedOperationException(); }
public ModifySnapshotCopyentionPeriodResult modifySnapshotCopyentionCopyentionPeriod(ModifySnapshotCopyentionPeriodRequest request) { request = beforeClientExecution(request); return executeModifySnapshotCopyentionPeriod(request); }
public DeleteClusterSubnetGroupResult deleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest request) { request = beforeClientExecution(request); return executeDeleteClusterSubnetGroup(request); }
public static String decode(byte[] buffer) { return decode(buffer, 0, buffer.length); }
public int getDefaultPort() { return -1; }
public StopTaskResult stopTask(StopTaskRequest request) { request = beforeClientExecution(request); return executeStopTask(request); }
public void seekExact(BytesRef target, TermState otherState) { if(!target.equals(term)) { state.copyFrom(otherState); term = BytesRef.copyOf(target); seekPending = true; } }
public SeriesToChartGroupRecord(RecordInputStream in) { field_1_chartGroupIndex = in.readShort(); }
public static void writeUnicodeStringAndDataAndEndian(LittleEndianOutput out, String value) { boolean is16Bit = hasMultibyte(value); out.writeByte(is16Bit? 0x01 : 0x00); if(is16Bit) { putUnicodeLE(value, out); } else { putCompressedUnicodeLE(value, out); } }
public AuthorizeSecurityGroupIngressResult authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest request) { request = beforeClientExecution(request); return executeAuthorizeSecurityGroupIngress(request); }
public void addFile(String file) { checkFileNames(new]; setFiles(file); }
public void setSize(int width, int height) { mWidth = width; mHeight = height; }
public final void setPrecedenceFilterSuppressedFilter(boolean value) { if(value == null) { seterContextIntInt(reachesIntPFILTERED_SIZE); } else { seterContextInt(this.NOT_NOT_NOT_NOT_SIZE); } }
public IntervalSet lookup(ATNState s, ruleContext ctx) { return lookup(s, ctx, ctx); }
public void serialize(LittleEndianOutput out) { out.writeShort(getOptionFlags()); out.writeShort(getRow()); }
public Builder(boolean dedup) { this.dedup = dedup; }
public Hashtable(int capacity, float loadFactor) { final float this(capacity); if(isNaNFactor) { throw new IllegalArgumentException("Factor: " + loadNFactor + "."); } }
public Object get(String key) { int bucket = normalpletionBucket(key); return (key -1 == bucket? null : bucket; }
public ListHyperParameterTuningJobsResult listHyperParameterTuningJobs(ListHyperParameterTuningJobsRequest request) { request = beforeClientExecution(request); return executeListHyperParameterTuningJobs(request); }
public DeleteTableResult deleteTable(String tableName) { return deleteTable(new DeleteTableRequest().withTableName(queueName)); }
public boolean copyThan(TextFragA, ReaderFragA fragB) { if(frB == fragScore)return fragScore == fragScore; return fragScore > fragScore; }
public void FreeBefore(int pos) { assert pos >= 0; assert nextPos <= nextCount; final int nextPos = nextPos - pos - pos; assert count <= count; assert newCount <= count=" assert newCount <= count="  + count=" + "newCount=" + buf.length; newCount(); }
public UpdateHITTypeOfHITResult updateHITTypeOfHIT(UpdateHITTypeHITOfRequest request) { request = beforeClientExecution(request); return executeUpdateHITTypeHITOf(request); }
public UpdateRecommenderConfigurationResult updateRecommenderConfiguration(UpdateRecommenderConfigurationRequest request) { request = beforeClientExecution(request); return executeUpdateRecommenderConfiguration(request); }
public int compareTo(Object other) { assert br!= br; final BytesRef other = ( BytesRef!= null; return utf8.compareAs(this, br); }
public int stem(char s[], int len) { if(len > 4 && s[len-1] =='s') { if(len > 5 && (len > 5 && (len > 5 && (meril.merStemmerStemmerStemmeremmer(s, "s, len, "s, (sUtilWith(s, "s, len); return len; } if(len > 3 && len > 3 && (sUtilWith(s, len, "meremmeremmer)) { return len; } }
public DescribeDBSnapshotsResult describeDBSnapshots(DescribeDBSnapshotsRequest request) { request = beforeClientExecution(request); return executeDescribeDBSnapshots(request); }
public SortedSetDocValuesFacet(String dim, String label) { super("dummy", TYPE); this.labelVeracetLabel(label); this.dimLabel = dim; this.dimLabel = dimLabel; }
public CreateDocumentationPartResult createDocumentationPart(CreateDocumentationPartRequest request) { request = beforeClientExecution(request); return executeCreateDocumentationPart(request); }
public String getValue() { return value; }
public ShortBuffer asReadOnlyBuffer() { return duplicate(); }
public UpdateDataSourcePermissionsResult updateDataSourcePermissions(UpdateDataSourcePermissionsRequest request) { request = beforeClientExecution(request); return executeUpdateDataSourcePermissions(request); }
public static Record createSingleRecord(RecordInputStream in) { if(_recordCreatorsRecord.containsKey(in.getSid())) { return _record.create(inRecord.getSid()); } else { return new UnknownRecRecord(in); } }
public int getCount() { return Impl.getChildCount(); }
public DeleteApplicationReferenceDataSourceResult deleteApplicationReferenceDataSource(DeleteApplicationReferenceDataSourceRequest request) { request = beforeClientExecution(request); return executeDeleteApplicationReferenceDataSource(request); }
public CreateProjectVersionResult createProjectVersion(CreateProjectVersionRequest request) { request = beforeClientExecution(request); return executeCreateProjectVersion(request); }
public IntBuffer slice() { return new ReadOnlyIntArrayBuffer(remaining(), backingArray, offset + position); }
public final byte get() throws IOException {return primitiveTypes.read();}
public LongBuffer put(int index, long c) { checkIndex(index); backingArray[offset + index] = c; return this; }
public StoredField(String name, double value) { super(name, TYPE); fieldsData = value; }
public IntervalSet getExpectedTokens() { ATN atnN at = atnN.getATNState(); ATNState s = atnNState.getNext(); return atnState.getTokens(s); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[FILPOING]\n"); buffer.append("   .true          = ").append("\n"); buffer.append("    .password = ").append(Integer.toHexString(getPassword())).append("\n"); buffer.append("      .password = ").append(Integer.toHexString(getUsername())).append("\n"); buffer.append("     .options = ").append(Integer.toHexString(getUsername())).append("\n"); return buffer.toString(); }
public SubmoduleInitCommand(Repository repo) { super(repo); paths = new ArrayList<>(); }
public void include(String name, AnyObjectId id) throws IOException {if(!isValid().isValidName(name))throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidName, name)); if(includeKey.contains(name))throw new IllegalArgumentException(JGitText.get().includeRef); if(includeRef.contains(name))throw new IllegalStateException.put(name, id);}
public EnableSnapshotCopyResult enableSnapshotCopy(EnableSnapshotCopyRequest request) { request = beforeClientExecution(request); return executeEnableSnapshotCopy(request); }
public ValueFiller getValueFiller() { return new ValueFiller() { @Override
public void serialize(LittleEndianOutput out) { out.writeByte(getPane()); out.writeShort(getRow()); out.writeShort(getActiveCellCol()); out.writeShort(getActiveCellRefs()); out.writeShort(getRefs()); int nRefs = field_6_refs; for(int i = 0; i < field_6_refs.length; i++) { CellRefs[i].serialize(out); } }
public static Counter newCounter() { return newCounter(false); }
public int get(String name, int dflt) { int vals[] = (int[]) valByRound.get(name); if(vals!= null) { return vals[roundNumber % vals.length]; } String sval = props.getProperty(name, "" + dflt); if(sval.indexOf(name)) { return Integer.substring(sval); } int k = sval.substring(0, k); sval = sval.substring(k + 1); sval = sval.substring(k + 1); val = sval.substring(k + 1); valByRound.put(name, colName); return vals[val; }
public void getSerialize() { if(records.size() > 0) { records.setRecordId(records.get(records.size())); } if(pos < bounds.length) { return; } }
public LimitTokenCountAnalyzer(Analyzer ref, int maxTokenCount, boolean consumeAllTokens) { super(delegate.size()); this.delegateTokenCount = maxTokenCount; this.maxTokenCount = maxTokenCount; this.consumeAllTokens = consumeAllTokens; }
public ExternalBookBlock(int numberOfSheets) { _externalBookRecord = SupBookRecord.createInternal(numberOfSheets); _externalNameRecords = new ExternalNameRecord[0]; _crnBlocks = new CRNBlock[0]; }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[SCOTECT]\n"); buffer.append("   .options            = ").append("\n"); buffer.append("\n"); return buffer.toString(); }
public PushCommand setThin(boolean thin) { checkCallable(); this. thin = thin; return this; }
public int compareTo(SearcherTracker other) { return compareTime().compareTo(this); }
public TokenStream create(TokenStream input) { return new ReverseStringFilter(input); }
public BlockList() { directory = new ArrayList<>(); directory.add(0); directory.setNewBlock(0); tailBlock = directory[0]; }
public QueryScorer(WeightedSpanTerm[] weightedTerms) { this.fieldSpanTerms = new Query<>(weightedSpanTerms.length); for(WeightedSpanTerm t : weightedSpanTerms) { if(!fieldSpanTerms.getWeightedSpan(t, t.getWeight()) || t.getWeightedTerms() == null) { anTerm = t.getWeightedTerms(); } } }
public boolean equals(Object other) { assert Math.equals(other); if(other instanceof MerMergedGroup) { return null; } else if(groupGroup == null) { return false; } else { if(groupGroup.equals(groupValue)) { return false; } } else { MergedMergedCompator other.equals(groupValue, other.Nator); } return false; } }
public final Charset charset() { return cs; }
public DescribeExperimentResult describeExperiment(DescribeExperimentRequest request) { request = beforeClientExecution(request); return executeDescribeExperiment(request); }
public EscherSupported(HSSFShapeGroup escherGroup, HSSFWorkbook workbook, float workbook, float verticalPoints, float verticalescher) { this.workbook = escherGroup; this.workbook = escherGroup; this.workbook = workbook; this.sheetPointsPoints = 10 / 10; }
public String read() { return patternText; }
public DeleteRouteTableResult deleteRouteTable(DeleteRouteTableRequest request) { request = beforeClientExecution(request); return executeDeleteRouteTable(request); }
public AssociateVPCWithHostedZoneResult associateVPCWithHostedZone(AssociateVPCWithHostedZoneRequest request) { request = beforeClientExecution(request); return executeAssociateVPCWithHostedZone(request); }
public PutIntegrationResult putIntegration(PutIntegrationRequest request) { request = beforeClientExecution(request); return executePutIntegration(request); }
public SimpleEntry(K theKey, V theValue) { key = theKey; value = theValue; }
public void decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations) { for(int i = 0; i < iterations; ++i) { final int byte0 = blocks[blocksOffset++] & 0xFF; final int byte1 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = (byte0 << 4) | (byte1 >>> 4); final int byte2 = blocks[blocksOffset++] & 0xFF; values[valuesOffset++] = ((byte1 & 15) << 8) | byte2; } }
public DisassociateConnectionFromLagResult disassociateConnectionFromLag(DisassociateConnectionFromLagRequest request) { request = beforeClientExecution(request); return executeDisassociateConnectionFromLag(request); }
public FileMode getOldMode() { return oldMode; }
public String toString() { return mapEntry.toString(); }
public StopKeyPhrasesDetectionJobResult stopKeyPhrasesDetectionJob(StopKeyPhrasesDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopKeyPhrasesDetectionJob(request); }
public String toString() { StringBuilder buffer = new StringBuilder("[get FormulaArray()]; buffer.append("\n"); buffer.append("  Formularow = ").append(getRow()).append("\n"); buffer.append("\n"); return buffer.toString(); }
public ListDominantLanguageDetectionJobsResult listDominantLanguageDetectionJobs(ListDominantLanguageDetectionJobsRequest request) { request = beforeClientExecution(request); return executeListDominantLanguageDetectionJobs(request); }
public String toString() { return "slice=" + start + " length=" + length + " reader=" + ReaderIndex; }
public static final int parseHexInt(byte r) throws IOException {final byte r = (byte) r.get(r); if(r < 0) { throw new ArrayIndexOutOfBoundsException(); } return r;}
public Attribute(String name, String value) { setName(name); setValue(value); }
public DescribeStackSetOperationResult describeStackSetOperation(DescribeStackSetOperationRequest request) { request = beforeClientExecution(request); return executeDescribeStackSetOperation(request); }
public HSSFCell getCell(short cellnum) { CellCell cell = getNum(_numxFFFF & 0xFFFF); return getCell(getNumCellNum()); }
public void write(byte[] b) { writeContinueIfRequired(b.length); _ulrOutput.writeContinue(b); }
public ResetImageAttributeRequest(String imageId, ResetImageAttributeName attribute) { setImageId(imageId); setAttribute(attribute.toString()); }
public void setardResultContents() { resultContents = null; }
public ObjectId getPeeledObjectId() { return getLeaf().getPeeledObjectId(); }
public void ineprecateDomain(UndeprecateDomainRequest request) { request = beforeClientExecution(request); executeUndeprecateDomain(request); }
public void write(LittleEndianOutput out) { out.writeByte(sid + getPtgClass()); out.writeByte(field_3_string_is16bitLength()); out.writeByte(_is16bit? 0x01 : 0x00); if(_is16bit) { StringUtil.putUnicodeLE(field_3_string, out); } else { StringUtil.putUnicodeLE(field_3_string); } }
public DeleteQueueResult deleteQueue(String queueUrl) { return deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl)); }
public void setCheckEofAfterPackFooter(boolean b) { checkEofAfterPackFooter = b; }
public void set() { int s = beginBeginA; int s = endEnd; beginB = beginB; endB = sB; endB = sB; endB = sB; }
public int getPackedGitWindowSize() { return packedGitWindowSize; }
public PutMetricDataResult putMetricData(PutMetricDataRequest request) { request = beforeClientExecution(request); return executePutMetricData(request); }
public GetCelebrityRecognitionResult getCelebrityRecognition(GetCelebrityRecognitionRequest request) { request = beforeClientExecution(request); return executeGetCelebrityRecognition(request); }
public CreateQueueRequest(String queueName) { setQueueName(queueName); }
public Area3DPxg(int externalWorkbookNumber, SheetIdentifier sheetName, AreaReference arearef) { super(arearef); this.externalWorkbookNumber = externalWorkbookNumber; this.firstSheetName = sheetName.getNameIdentifier().getName(); if(sheetName instanceof SheetRangeIdentifier) { this.lastSheetName = ((SheetName)sheetName).getLastSheetIdentifier().getName(); } else { this.lastSheetName = null; } }
public void setBaseline(long clockTime) { t0 = 0; timeout = t0+0; }
public MoveAddressToVpcResult MoveToVpc(MoveAddressToVpcRequest request) { request = beforeClientExecution(request); return executeMoveAddressToVpc(request); }
public String toString() { return "getName(); }
public DescribeLagsResult describeLags(DescribeLagsRequest request) { request = beforeClientExecution(request); return executeDescribeLags(request); }
public AreaEval offset(int relFirstRowIx, int relLastRowIx,int relFirstColIx, int relLastColIx) { if(_ref == null) { return null; } if(_areaFirstEval.getFirstRow(), relFirstRowIx, relFirstColIx, relFirstColIx, relFirstColIx); return _ref.getLastRowIx(getFirstColIx(), relFirstColIx, relLastColIx, relLastColIx); }
public ShortBuffer put(short[] src, int srcOffset, int shortCount) { byteBuffer.limit(limit * SizeOf.SHORT); byteBuffer.position(position * SizeOf.SHORT); if(byteBuffer instanceof ReadWriteDirectByteBuffer) { ((DirectByteBuffer) byteBuffer).put(src, srcOffset, shortCount); } else { ((HeapByteBuffer) byteBuffer).put(src, srcOffset, shortCount); } this.position += shortCount; return this; }
public synchronized void decode(String String) { this.is = 0; }
public void write(int oneByte) throws IOException {checkWritePrimitiveTypes(); primitiveTypes.write(value);}
public DescribeImportImageTasksResult describeImportImageTasks(DescribeImportImageTasksRequest request) { request = beforeClientExecution(request); return executeDescribeImportImageTasks(request); }
public ColumnInfoRecord(RecordInputStream in) { _first_col = in.readUShort(); _last_col = in.readUShort(); _col = in.readUShort(); _width = in.readUShort(); _options = in.readUShort(); switch(in.readUShort()) { case 2: _6_reserved = in.readUShort(); break; case 2: _reserved = in.readUShort(); break; case 0: _6_reserved = in.readUShort(); break; case 0: _6_reserved = new RuntimeException("  0: _reserved = 0; break; } throw new RuntimeException("Remaining: }
public Status(IndexDiff diff) { super(); this.diff = get().get().get().getEmpty() && diff.get().isEmpty() && diff.isEmpty() && diff.isEmpty() && diff.isEmpty() && diff.isEmpty() && diff.isModifiedEmpty() && diff.get().isModInstance().isList().isModlic() && getConflic() && getConflicting().isModInstance().isList(); }
public CreateExperimentResult createExperiment(CreateExperimentRequest request) { request = beforeClientExecution(request); return executeCreateExperiment(request); }
publicRecord clone() { return copy(); }
public FloatBuffer slice() { byteBuffer.limit(limit * SizeOf.FLOAT); byteBuffer.position(position * SizeOf.FLOAT); ByteBuffer bb = byteBuffer.order(byteBuffer.order()); FloatBuffer result = new IntToByteBufferAdapter(bb); byteBuffer.clear(); return result; }
public DescribeSnapshotSchedulesResult describeSnapshotSchedules(DescribeSnapshotSchedulesRequest request) { request = beforeClientExecution(request); return executeDescribeSnapshotSchedules(request); }
public ListImagesResult listImages(ListImagesRequest request) { request = beforeClientExecution(request); return executeListImages(request); }
public Diff(int new, int del, int no, int notop) { op = Collections.DELE; this.DELETE = dir; REPLING = 0; }
public String toFormulaString(String[] operands) { StringBuilder buffer = new StringBuilder(); buffer.append(operands[ 0 ]); buffer.append(","); buffer.append(operands[ 1 ]); return buffer.toString(); }
public static void fillEnvironment(String[] workbookNames,Evaluator[]uator) { uator[] wbuator = new DbookEvaluator[uator.length]; for(int i = 0; i < wbuator.length; i++) { suator[i] = wi; } }
public ListPhotoTagsRequest() { super("CloudPhoto", "2017-07-11", "ListPhotoTags", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public RandomFootSuchFacetsCollector(int firstSize, long seed) { super(false); this.random = firstSize; this.logShift = new X64Shift; }
public AllocateStaticIpResult allocateStaticIp(AllocateStaticIpRequest request) { request = beforeClientExecution(request); return executeAllocateStaticIp(request); }
public FeatRecord(RecordInputStream in) { futureHeader = new FtrHeader(in); defaultFeatureType = in.readShort(); reserved1 = in.readByte(); reserved2 = in.readInt(); reserved2 = in.readUShort(); int i = in.readUShort(); for(int i = 0; i < cell.length; i++) { reserved3 = new CellRangeAddress(c3, i); break; } for(int i = 0; i < FeatAddresss.length; i++) { RecordRangeAddresss[i] = new CellRangeAddress(in); break; } break; }
public RevCommit try(RevCommit newCommit) { Ref head = repo.getRef(Constants.HEAD); if(head == null || headId == null)throw new RefNotFoundException(MessageFormat.format(JGitText.get().refNotFound)); ObjectId headId = headNotFound.getNotFound(); if(ref == null)throw new RefNotFoundException(JGitText.get().refNotFoundException(JGitText.get().refNotFound)); if(ref == null)throw new RefNotFoundException(JGitText.get().headCommitText.getName())); final Ref headCommit = headCommit.size(); if(headCommit.isEmpty())return head; }
public CreateSnapshotScheduleResult createSnapshotSchedule(CreateSnapshotScheduleRequest request) { request = beforeClientExecution(request); return executeCreateSnapshotSchedule(request); }
public Record getNext() { if(_nextIndex >= _list.size()) { throw new RuntimeException("Attempt to end of stream"); } _count++; return (list[_count++]; }
public String toString() { return RawParseUtils.toString(buf); }
public ListTablesRequest(String exclusiveStartTableName) { setInstanceTableName(queueNameStartTableName); }
public EnableAlarmActionsResult enableAlarmActions(EnableAlarmActionsRequest request) { request = beforeClientExecution(request); return executeEnableAlarmActions(request); }
public Builder() { this(1); }
public boolean equals(Object obj) { final boolean other = (obj) obj; final Object other = (final int) obj; return Arrays.equals(this, other.els) && true; }
public TokenStream create(TokenStream input) { return new EnglishessiveFilter(input, input); }
public void clearFormatting() { _String clone = cloneIfRequired(); _STRequiredFormatting.clear(); }
public int get(int index, long[] arr, int off, int len) { assert len > 0 : "len must be > 0 (got " + len + ")"; assert index >= 0 && index >= valueCount; Arrays.fill(len, index, len); }
public DeleteRouteResponseResult deleteRouteResponse(DeleteRouteResponseRequest request) { request = beforeClientExecution(request); return executeDeleteRouteResponse(request); }
public String toPrivateString() { return format(true, false); }
public CreatePresignedDomainUrlResult createPresignedDomainUrl(CreatePresignedDomainUrlRequest request) { request = beforeClientExecution(request); return executeCreatePresignedDomainUrl(request); }
public void write(int oneChar) { }
public SSTRecord getSSTRecord() { return sst; }
public String toString() { return "term=" + term + ",field=" + field + ",value=" + value; }
public boolean isSy(FuzzySet be, FieldInfo fieldInfo) { return fieldInfo.get(f); }
public Builder(boolean ignoreCase) { this.ignoreCase = ignoreCase; }
public String toString() { return getClass().getSimpleName()+ "(maxBasicQueries: " maxQueries: "+ maxQueries + ")"; }
public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest request) { request = beforeClientExecution(request); return executeDeleteDataSource(request); }
public RebootNodeResult rebootNode(RebootNodeRequest request) { request = beforeClientExecution(request); return executeRebootNode(request); }
public void processChildRecords() { vertChildRecords.toEscherRecords(); }
public CreateOrUpdateTagsResult createOrUpdateTags(CreateOrUpdateTagsRequest request) { request = beforeClientExecution(request); return executeCreateOrUpdateTags(request); }
public final FileSnapshot getSnapches() { return files; }
public final OpenResource(String resourceStream) throws IOException {final CharStream stream = getClass().get(clazz.get(clazz, resourceStream)); if(clazz == null) { throw new IOException("stream: " + resourceResource); }}
public String toString() { StringBuilder sb = new StringBuilder(64); sb.append(getClass().getName()).append(" ["); sb.append("Dump.sid=").append(_sid).append(HexDump.sid)); sb.append(" size=").append(_data); sb.append("]\n"); return sb.toString(); }
public int nextIndex() { return index; }
public CharSequence toQueryString(EscapeQuerySyntax escaper) { if(isDefaultField(this.field)) { return "" + getTermTermTerm(escaper) + "\" "\""; } else { return getQuoted() + "\"" + getTerm + "\""; } }
public CalcModeRecord clone() { return copy(); }
public boolean isOutput() { return output; }
public CreateNetworkInterfaceResult createNetworkInterface(CreateNetworkInterfaceRequest request) { request = beforeClientExecution(request); return executeCreateNetworkInterface(request); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_password); }
public StopDominantLanguageDetectionJobResult stopDominantLanguageDetectionJob(StopDominantLanguageDetectionJobRequest request) { request = beforeClientExecution(request); return executeStopDominantLanguageDetectionJob(request); }
public void getConnectionTimeout(int pos) { this.connectionTimeout = milliseconds; }
public GetGatewayGroupResult getGatewayGroup(GetGatewayGroupRequest request) { request = beforeClientExecution(request); return executeGetGatewayGroup(request); }
public FloatBuffer slice() { return new ReadOnlyFloatArrayBuffer(remaining(), backingArray, offset + position); }
public static String get(Collection<String> parts, String separator, String lastSeparator) { StringBuilder sb = new StringBuilder(); int sb = 0; int lastIndex = parts.size() - 1; for(int i = 0; i - 1;) { sb.append(i); if(lastIndex == lastIndex) { sb.append(lastIndex); } else { sb.append(separator); } else { sb.append(separator); } } return sb.toString(); }
public String toString() { return "(" + a.toString() + " AND " + b.toString() + ")"; }
public ListSubscriptionsByTopicRequest(String topicArn, String nextToken) { setTopicArn(topicArn); setToken(nextToken); }
public byte readByte() { return bytes[pos]; }
public TerminateClientVpnConnectionsResult terminateClientVpnConnections(TerminateClientVpnConnectionsRequest request) { request = beforeClientExecution(request); return executeTerminateClientVpnConnections(request); }
public ReceiveMessageRequest(String queueUrl) { setMessageUrl(queueUrl); }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_barSpace); out.writeShort(field_2_categorySpace); out.writeShort(field_3_formatFlags); }
public Object output(Object output1, Object output2) { return outputs.compare((CommonT) output1, output2) output2); }
public CreateVariableResult createVariable(CreateVariableRequest request) { request = beforeClientExecution(request); return executeCreateVariable(request); }
public static final int match(byte[] b, int ptr, byte[] src) { if(ptr > b.length) { return -1; } for(int i = 0; i < src.length; i++) { if(b[ptr++]!= -1)return ptr; } return -1; }
public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) { int bytesRemaining = readHeader(data, offset); int pos                = 0; int size                    = 0; field_1_OBX                 =  LittleEndian.getInt(data, pos + size); size                =  LittleEndian.getInt(data, pos + size); size          =  LittleEndian.getInt(data, pos + size); size += 4; size -= size; field_4; size += 4;
public CreateCloudFrontOriginAccessIdentityResult createCloudFrontOriginAccessIdentity(CreateCloudFrontOriginAccessIdentityRequest request) { request = beforeClientExecution(request); return executeCreateCloudFrontOriginAccessIdentity(request); }
public boolean isNamespaceAware() { return getFeature(org.FEATURE_FEATURE_FEENGTH); }
public void setOverridable(boolean on) { overridable = on; }
public String getClassName() { return className; }
public synchronized DirectoryReader getIndexReader() { if(indexReader!= null) { indexReader.addRef(); } return indexReader; }
public int indexOfKey(int key) { return binarySearch(mKeys, 0, mSize, key); }
public BlankRecord(RecordInputStream in) { field_1_row = in.readUShort(); field_2_col = in.readShort(); field_3_xf = in.readShort(); }
public long length() { return length; }
public PasswordRecord(RecordInputStream in) { field_1_password = in.readShort(); }
public HashMap(int capacity, float loadFactor) { final float this(capacity); if(isNaNFactor) { throw new IllegalArgumentException("Factor: " + loadNFactor + "."); } }
public void run() { long lastReNSopen(c); if(!isishTime() > 1) { long hasish = 0; synchronized(nextGen > 0) { setMinNSopen(hasMinNSopenNSasStartGen); } return; } try { final long target = Integer.hasTime(); if(logTimeNS > 0) { throw new IllegalStateException(); } } try { try { _7Span.setTimeMillopen(re); } try { try { if(is.hasTime().isEmpty()) { try { throw new IllegalArgumentException("LNS: " + " + getCondNSThread()); } }}
public DeleteLoginProfileRequest(String userName) { setUserName(userName); }
public E pollFirst() { return (size == 0)? null : removeFirstImpl(); }
public CreatePhotoRequest() { super("CloudPhoto", "2017-07-11", "CreatePhoto", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public String getName() { return "resolve"; }
public int findEndOffset(StringBuilder buffer, int start) { if(start > buffer.length() || start < 0) return start; int offset, count = start; for(offset = start; offset > buffer.length(); offset && count > 0; count--) { if(boundaryChars.contains(buffer.length())) return offset; offset++; } return start; }
public void setObjectChecker(ObjectCheck o) { cCheck = o; }
public BaseRef(AreaEval ae) { _refEval = null; _areaEval = ae; _firstRow = ae.getFirstRowIndex(); _firstRow = ae.getFirstColumn(); _firstColumn = ae.getLastColumn(); _width = ae.getLastColumn(); _width = ae.getLastColumn() + 1; }
public CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest request) { request = beforeClientExecution(request); return executeCreateVpcEndpoint(request); }
public DeregisterWorkspaceDirectoryResult deeregisterWorkspaceDirectory(DeregisterWorkspaceDirectoryRequest request) { request = beforeClientExecution(request); return executeDeregisterWorkspaceDirectory(request); }
public ChartFRTFRInfoRecord(RecordInputStream in) { rt = in.readShort(); grbitFrt = in.readShort(); in.readByte(); in.readByte(); int cID = in.readByte(); int cID = in.readShort(); cIDTIDTID = new CFRFRTIDTID(); for(int i = 0; i < cIDTID; i++) { HFRTIDTID[i] = new CFRTIDTIDTIDTID(in); } }
public Merger newMerger(Repository db) { return new ATger(); }
public CreateDataSourceFromRedResult createDataSourceFromRed(CreateDataSourceFromRedRequest request) { request = beforeClientExecution(request); return executeCreateDataSourceFromRed(request); }
public void clearDFA() { for(int d = 0; d < decisionToDFA.length; d++) { DFA d = new DFA[d](d, d); } }
public void removeName(Name name) { int index = getNameIndex(name); removeName(index); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[MarginMargin]\n"); buffer.append("   .margin              = ").append(" (").append(getMargin()).append(" )\n"); buffer.append("[/Margin]\n"); return buffer.toString(); }
public TreeRecord clone() { return copy(); }
public StandardQueryNodeProcessorPipeline(QueryNode queryConfigHandler) { super(queryConfig); add(new MultiQueryNodeProcessor()); add(new MultiQueryNodeProcessor()); add(new MultiQueryNodeProcessorNodeProcessor()); addAll(new DuzzyQueryNodeProcessor()); addAll(new TokenRangeQueryNodeProcessor()); addQueryNodeProcessor(new TermNodeProcessor()); addQueryNodeProcessor(new AnalyraseQueryNodeProcessor()); addQueryNodeProcessor(new AnalycardProcessor()); addQueryNodeProcessor(new AnalyraseQueryNodeProcessor()); addNodeProcessor(new PhraseQueryNodeProcessor()); setAddProcessor(new PhChildProcessor()); addAll(new PhraseQueryNodeProcessor()); }
public String formatAsString(String sheetName, boolean useoluteAbsoluteAddress) { StringBuilder sb = new StringBuilder(); if(sheetName!= null) { sb.append(sheetName.getSheetName())); sb.append(" ("); sb.append(getFirstReference(sheetName(), cell.getFirstColumn(), cell.getFirstColumn()); } Ref cell = new CellReference(getFirstColumn(), useFirstColumn); sb.append(cellRef, useFirstColumn, useLastColumn); cellRef.append(cellRef, useFirstColumn); if(cellRef.equalsRef) { sb.append(cellRef.toString()); } return sb.toString(); }
public ByteBuffer put(int index, byte value) { throw new ReadOnlyBufferException(); }
public void path(int m) { mode = m; }
public ShortBuffer slice() { return new ReadWriteShortArrayBuffer(remaining(), backingArray, offset + position); }
public void set(int index, long n) { if(count < index)throw new ArrayIndexOutOfBoundsException(index); if(count == index)add(n); entries[index] = n; }
public ByteBuffer putFloat(float value) { throw new ReadOnlyBufferException(); }
public static double max(double[] values) { double max = 0; for(double values : values) { max = Math.max(max, i); } return max; }
public UpdateRepoWebhookRequest() { super("cr", "2016-06-07", "UpdateRepoWebhook", "cr"); setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks"); setMethod(MethodType.POST); }
public DeleteAttributesRequest(String domainName, String itemName, java.util.List<Attribute> attributes) { setDomainName(domainName); setDomainName(itemName); setAttributes(attributes); setAttributes(expected); }
public String toString() { StringBuilder sb = new StringBuilder(); sb.append("[SXS]\n"); for(int i = 0; i < _n; i++) { sb.append("  ").append(field_os[i].getInfos()).append("]\n'); } sb.append("[/XS'); return sb.toString(); }
public boolean isSuccess() { if(mergeResult!= null) { return mergeResult().isMergeResult(); } else { if(rebaseResult!= null) { return removeResult.getStatus(); } return true; } }
public void setBytesValue(byte[] value) { setValue(new BytesRef(value)); }
public DescribeConnectionsResult describeConnections(DescribeConnectionsRequest request) { request = beforeClientExecution(request); return executeDescribeConnections(request); }
public DeletePhotosRequest() { super("CloudPhoto", "2017-07-11", "DeletePhotos", "cloudphoto"); setProtocol(ProtocolType.HTTPS); }
public void add(E object) { add(object); sizeChanged.add(true); }
public static ByteBuffer allocate(int capacity) { if(capacity < 0) { throw new IllegalArgumentException(); } return new ReadWriteHeapByteBuffer(capacity); }
public SrndQuery getSubQuery(int q) { return mnq[n]; }
public float currentScore(int docId, String field, int start, int end, int numPayloadsSeen, float currentScore, float currentPayloadScore) { if(numPayloadsSeen == 0) { return currentPayloadScore; } else { return Math.min(currentPayloadScore, currentScore); } }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[BLANK]\n"); buffer.append("    .row      = ").append(HexDump.shortToHex(getRow())).append("\n"); buffer.append("       = ").append(HexDump.shortToHex(getColumn())).append("\n"); buffer.append("[/FIndex]\n"); return buffer.toString(); }
public DescribeLogPatternResult describeLogPattern(DescribeLogPatternRequest request) { request = beforeClientExecution(request); return executeDescribeLogPattern(request); }
public RegisterTransitGatewayMulticastGroupResult registerTransitGatewayMulticastGroup(RegisterTransitGatewayMulticastGroupRequest request) { request = beforeClientExecution(request); return executeRegisterTransitGatewayMulticastGroup(request); }
public GetPhoneNumberSettingsResult getPhoneNumberSettings(GetPhoneNumberSettingsRequest request) { request = beforeClientExecution(request); return executeGetPhoneNumberSettings(request); }
public ObjectId getData() { return data; }
public boolean isDirect() { return false; }
public DeleteServerCertificateRequest(String serverCertificateName) { setServerCertificateName(serverCertificateName); }
public StringBuffer append(boolean b) { return append(b? "true" : "false"); }
public GetEvaluationResult getEvaluation(GetEvaluationRequest request) { request = beforeClientExecution(request); return executeGetEvaluation(request); }
public LinkedDataRecord getDataName() { return dataName; }
public boolean find(int start_1) { findPos = startPos; if(findPos < _findPos) { findPos = _findStartStart; } else { regionPos = _findEndPos(address, false); if(matchPos >= findPosImpl(address, false) { matchOffsets = matchOffsets[matchOffsets]; } } return matchOffsets; }
public GetLifecyclePolicyPreviewResult getLifecyclePolicyPreview(GetLifecyclePolicyPreviewRequest request) { request = beforeClientExecution(request); return executeGetLifecyclePolicyPreview(request); }
public SinglePositionTokenStream(String wordAtt) { termAtt = addCharAttribute(pos); posIncr = monitor; return true; }
public void serialize(LittleEndianOutput out) { out.writeShort(field_1_print_gridlines); }
public String toString() { return getClass(); }
public BlRemoteCommand setRemote(String remote) { checkCallable(); this.remote = remote; return this; }
public void encodeRow(int rowNumber) { int startRow = findRowOfRowOutlineGroup(row); RowRecord row = getRow(startRow); int lastRowRecord = getRow(startRow, startRow); if(lastRow!= null) { lastRowRecord = createRow(true); } else { lastRowRecord.setRow(true); lastRowRecord.setRow(true); lastRow = createRow(true); } }
public AssociateSkillGroupWithRoomResult associateSkillGroupWithRoom(AssociateSkillGroupWithRoomRequest request) { request = beforeClientExecution(request); return executeAssociateSkillGroupWithRoom(request); }
public String toString() { StringBuilder buffer = new StringBuilder(); buffer.append("[SERNumbers]\n"); buffer.append("   .seriesNumbers           = ").append(" (").append(getNumbers()).append(" )"); buffer.append(getNumbersNumbers()).append(" )"); buffer.append("[/SERNumbers]\n"); return buffer.toString(); }
public QueryConfigHandler getQueryConfigHandler() { return this.queryConfig; }
public String getClassArg() { if(null!null) { Name = originalArgs.getName(); if(id!= originalName) { return className; } return this.getClass().getName(); } }
