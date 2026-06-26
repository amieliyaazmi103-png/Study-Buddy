#
# There is insufficient memory for the Java Runtime Environment to continue.
# Native memory allocation (malloc) failed to allocate 32744 bytes. Error detail: Chunk::new
# Possible reasons:
#   The system is out of physical RAM or swap space
#   This process is running with CompressedOops enabled, and the Java Heap may be blocking the growth of the native heap
# Possible solutions:
#   Reduce memory load on the system
#   Increase physical memory or swap space
#   Check if swap backing store is full
#   Decrease Java heap size (-Xmx/-Xms)
#   Decrease number of Java threads
#   Decrease Java thread stack sizes (-Xss)
#   Set larger code cache with -XX:ReservedCodeCacheSize=
#   JVM is running with Unscaled Compressed Oops mode in which the Java heap is
#     placed in the first 4GB address space. The Java Heap base address is the
#     maximum limit for the native heap growth. Please use -XX:HeapBaseMinAddress
#     to set the Java Heap base and to place the Java Heap above 4GB virtual address.
# This output file may be truncated or incomplete.
#
#  Out of Memory Error (arena.cpp:168), pid=5696, tid=9208
#
# JRE version: OpenJDK Runtime Environment Temurin-21.0.11+10 (21.0.11+10) (build 21.0.11+10-LTS)
# Java VM: OpenJDK 64-Bit Server VM Temurin-21.0.11+10 (21.0.11+10-LTS, mixed mode, tiered, compressed oops, compressed class ptrs, g1 gc, windows-amd64)
# No core dump will be written. Minidumps are not enabled by default on client versions of Windows
#

---------------  S U M M A R Y ------------

Command Line: -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8 -XX:+ShowCodeDetailsInExceptionMessages main.Main

Host: AMD Ryzen 3 3250U with Radeon Graphics         , 4 cores, 3G,  Windows 11 , 64 bit Build 26100 (10.0.26100.8521)
Time: Fri Jun 26 05:27:43 2026 Malay Peninsula Standard Time elapsed time: 0.773526 seconds (0d 0h 0m 0s)

---------------  T H R E A D  ---------------

Current thread (0x00000273c919f990):  JavaThread "C1 CompilerThread0" daemon [_thread_in_native, id=9208, stack(0x0000007b13d00000,0x0000007b13e00000) (1024K)]


Current CompileTask:
C1:773  238       3       jdk.internal.org.objectweb.asm.Frame::execute (2305 bytes)

Stack: [0x0000007b13d00000,0x0000007b13e00000]
Native frames: (J=compiled Java code, j=interpreted, Vv=VM code, C=native code)
V  [jvm.dll+0x6d7e19]
V  [jvm.dll+0x8b5096]
V  [jvm.dll+0x8b764e]
V  [jvm.dll+0x8b7d33]
V  [jvm.dll+0x284596]
V  [jvm.dll+0xc685d]
V  [jvm.dll+0xc6da1]
V  [jvm.dll+0x14195e]
V  [jvm.dll+0x140c17]
V  [jvm.dll+0x19c440]
V  [jvm.dll+0x19c8a6]
V  [jvm.dll+0x157515]
V  [jvm.dll+0x156db7]
V  [jvm.dll+0x156fe4]
V  [jvm.dll+0x1563fc]
V  [jvm.dll+0x15818d]
V  [jvm.dll+0x25baad]
V  [jvm.dll+0x25a03a]
V  [jvm.dll+0x3f868e]
V  [jvm.dll+0x85fb0d]
V  [jvm.dll+0x6d664d]
C  [ucrtbase.dll+0x2cd30]
C  [KERNEL32.DLL+0x2e957]
C  [ntdll.dll+0x87c1c]


---------------  P R O C E S S  ---------------

Threads class SMR info:
_java_thread_list=0x00000273c92e7b00, length=11, elements={
0x00000273b0e8e870, 0x00000273c9100d50, 0x00000273c9104960, 0x00000273c9139690,
0x00000273c9179ee0, 0x00000273c913b880, 0x00000273c913bef0, 0x00000273c913dad0,
0x00000273c919f990, 0x00000273c93117d0, 0x00000273c931be60
}

Java Threads: ( => current thread )
  0x00000273b0e8e870 JavaThread "main"                              [_thread_in_vm, id=9704, stack(0x0000007b12e00000,0x0000007b12f00000) (1024K)]
  0x00000273c9100d50 JavaThread "Reference Handler"          daemon [_thread_blocked, id=18604, stack(0x0000007b13600000,0x0000007b13700000) (1024K)]
  0x00000273c9104960 JavaThread "Finalizer"                  daemon [_thread_blocked, id=7388, stack(0x0000007b13700000,0x0000007b13800000) (1024K)]
  0x00000273c9139690 JavaThread "Signal Dispatcher"          daemon [_thread_blocked, id=18172, stack(0x0000007b13800000,0x0000007b13900000) (1024K)]
  0x00000273c9179ee0 JavaThread "Attach Listener"            daemon [_thread_blocked, id=8440, stack(0x0000007b13900000,0x0000007b13a00000) (1024K)]
  0x00000273c913b880 JavaThread "Service Thread"             daemon [_thread_blocked, id=18708, stack(0x0000007b13a00000,0x0000007b13b00000) (1024K)]
  0x00000273c913bef0 JavaThread "Monitor Deflation Thread"   daemon [_thread_blocked, id=14908, stack(0x0000007b13b00000,0x0000007b13c00000) (1024K)]
  0x00000273c913dad0 JavaThread "C2 CompilerThread0"         daemon [_thread_in_native, id=20428, stack(0x0000007b13c00000,0x0000007b13d00000) (1024K)]
=>0x00000273c919f990 JavaThread "C1 CompilerThread0"         daemon [_thread_in_native, id=9208, stack(0x0000007b13d00000,0x0000007b13e00000) (1024K)]
  0x00000273c93117d0 JavaThread "Notification Thread"        daemon [_thread_blocked, id=10816, stack(0x0000007b13e00000,0x0000007b13f00000) (1024K)]
  0x00000273c931be60 JavaThread "Common-Cleaner"             daemon [_thread_blocked, id=18992, stack(0x0000007b13f00000,0x0000007b14000000) (1024K)]
Total: 11

Other Threads:
  0x00000273c90e17f0 VMThread "VM Thread"                           [id=9468, stack(0x0000007b13500000,0x0000007b13600000) (1024K)]
  0x00000273c905adf0 WatcherThread "VM Periodic Task Thread"        [id=18720, stack(0x0000007b13400000,0x0000007b13500000) (1024K)]
  0x00000273b31ecbf0 WorkerThread "GC Thread#0"                     [id=11768, stack(0x0000007b12f00000,0x0000007b13000000) (1024K)]
  0x00000273b31f4a60 ConcurrentGCThread "G1 Main Marker"            [id=18612, stack(0x0000007b13000000,0x0000007b13100000) (1024K)]
  0x00000273b31f5570 WorkerThread "G1 Conc#0"                       [id=17732, stack(0x0000007b13100000,0x0000007b13200000) (1024K)]
  0x00000273b324eaf0 ConcurrentGCThread "G1 Refine#0"               [id=12072, stack(0x0000007b13200000,0x0000007b13300000) (1024K)]
  0x00000273b324f670 ConcurrentGCThread "G1 Service"                [id=12036, stack(0x0000007b13300000,0x0000007b13400000) (1024K)]
Total: 7

Threads with active compile tasks:
C2 CompilerThread0  834  259       4       jdk.internal.org.objectweb.asm.ByteVector::putUTF8 (144 bytes)
C1 CompilerThread0  834  238       3       jdk.internal.org.objectweb.asm.Frame::execute (2305 bytes)
Total: 2

VM state: not at safepoint (normal execution)

VM Mutex/Monitor currently owned by a thread: None

Heap address: 0x00000000c8c00000, size: 884 MB, Compressed Oops mode: 32-bit

CDS archive(s) not mapped
Compressed class space mapped at: 0x0000000100000000-0x0000000140000000, reserved size: 1073741824
Narrow klass base: 0x0000000000000000, Narrow klass shift: 3, Narrow klass range: 0x140000000

GC Precious Log:
 CardTable entry size: 512
 Card Set container configuration: InlinePtr #cards 5 size 8 Array Of Cards #cards 12 size 40 Howl #buckets 4 coarsen threshold 1843 Howl Bitmap #cards 512 size 80 coarsen threshold 460 Card regions per heap region 1 cards per card region 2048
 CPUs: 4 total, 4 available
 Memory: 3533M
 Large Page Support: Disabled
 NUMA Support: Disabled
 Compressed Oops: Enabled (32-bit)
 Heap Region Size: 1M
 Heap Min Capacity: 8M
 Heap Initial Capacity: 56M
 Heap Max Capacity: 884M
 Pre-touch: Disabled
 Parallel Workers: 4
 Concurrent Workers: 1
 Concurrent Refinement Workers: 4
 Periodic GC: Disabled

Heap:
 garbage-first heap   total 57344K, used 2048K [0x00000000c8c00000, 0x0000000100000000)
  region size 1024K, 3 young (3072K), 0 survivors (0K)
 Metaspace       used 8433K, committed 8576K, reserved 1114112K
  class space    used 709K, committed 768K, reserved 1048576K

Heap Regions: E=young(eden), S=young(survivor), O=old, HS=humongous(starts), HC=humongous(continues), CS=collection set, F=free, TAMS=top-at-mark-start, PB=parsable bottom
|   0|0x00000000c8c00000, 0x00000000c8c00000, 0x00000000c8d00000|  0%| F|  |TAMS 0x00000000c8c00000| PB 0x00000000c8c00000| Untracked 
|   1|0x00000000c8d00000, 0x00000000c8d00000, 0x00000000c8e00000|  0%| F|  |TAMS 0x00000000c8d00000| PB 0x00000000c8d00000| Untracked 
|   2|0x00000000c8e00000, 0x00000000c8e00000, 0x00000000c8f00000|  0%| F|  |TAMS 0x00000000c8e00000| PB 0x00000000c8e00000| Untracked 
|   3|0x00000000c8f00000, 0x00000000c8f00000, 0x00000000c9000000|  0%| F|  |TAMS 0x00000000c8f00000| PB 0x00000000c8f00000| Untracked 
|   4|0x00000000c9000000, 0x00000000c9000000, 0x00000000c9100000|  0%| F|  |TAMS 0x00000000c9000000| PB 0x00000000c9000000| Untracked 
|   5|0x00000000c9100000, 0x00000000c9100000, 0x00000000c9200000|  0%| F|  |TAMS 0x00000000c9100000| PB 0x00000000c9100000| Untracked 
|   6|0x00000000c9200000, 0x00000000c9200000, 0x00000000c9300000|  0%| F|  |TAMS 0x00000000c9200000| PB 0x00000000c9200000| Untracked 
|   7|0x00000000c9300000, 0x00000000c9300000, 0x00000000c9400000|  0%| F|  |TAMS 0x00000000c9300000| PB 0x00000000c9300000| Untracked 
|   8|0x00000000c9400000, 0x00000000c9400000, 0x00000000c9500000|  0%| F|  |TAMS 0x00000000c9400000| PB 0x00000000c9400000| Untracked 
|   9|0x00000000c9500000, 0x00000000c9500000, 0x00000000c9600000|  0%| F|  |TAMS 0x00000000c9500000| PB 0x00000000c9500000| Untracked 
|  10|0x00000000c9600000, 0x00000000c9600000, 0x00000000c9700000|  0%| F|  |TAMS 0x00000000c9600000| PB 0x00000000c9600000| Untracked 
|  11|0x00000000c9700000, 0x00000000c9700000, 0x00000000c9800000|  0%| F|  |TAMS 0x00000000c9700000| PB 0x00000000c9700000| Untracked 
|  12|0x00000000c9800000, 0x00000000c9800000, 0x00000000c9900000|  0%| F|  |TAMS 0x00000000c9800000| PB 0x00000000c9800000| Untracked 
|  13|0x00000000c9900000, 0x00000000c9900000, 0x00000000c9a00000|  0%| F|  |TAMS 0x00000000c9900000| PB 0x00000000c9900000| Untracked 
|  14|0x00000000c9a00000, 0x00000000c9a00000, 0x00000000c9b00000|  0%| F|  |TAMS 0x00000000c9a00000| PB 0x00000000c9a00000| Untracked 
|  15|0x00000000c9b00000, 0x00000000c9b00000, 0x00000000c9c00000|  0%| F|  |TAMS 0x00000000c9b00000| PB 0x00000000c9b00000| Untracked 
|  16|0x00000000c9c00000, 0x00000000c9c00000, 0x00000000c9d00000|  0%| F|  |TAMS 0x00000000c9c00000| PB 0x00000000c9c00000| Untracked 
|  17|0x00000000c9d00000, 0x00000000c9d00000, 0x00000000c9e00000|  0%| F|  |TAMS 0x00000000c9d00000| PB 0x00000000c9d00000| Untracked 
|  18|0x00000000c9e00000, 0x00000000c9e00000, 0x00000000c9f00000|  0%| F|  |TAMS 0x00000000c9e00000| PB 0x00000000c9e00000| Untracked 
|  19|0x00000000c9f00000, 0x00000000c9f00000, 0x00000000ca000000|  0%| F|  |TAMS 0x00000000c9f00000| PB 0x00000000c9f00000| Untracked 
|  20|0x00000000ca000000, 0x00000000ca000000, 0x00000000ca100000|  0%| F|  |TAMS 0x00000000ca000000| PB 0x00000000ca000000| Untracked 
|  21|0x00000000ca100000, 0x00000000ca100000, 0x00000000ca200000|  0%| F|  |TAMS 0x00000000ca100000| PB 0x00000000ca100000| Untracked 
|  22|0x00000000ca200000, 0x00000000ca200000, 0x00000000ca300000|  0%| F|  |TAMS 0x00000000ca200000| PB 0x00000000ca200000| Untracked 
|  23|0x00000000ca300000, 0x00000000ca300000, 0x00000000ca400000|  0%| F|  |TAMS 0x00000000ca300000| PB 0x00000000ca300000| Untracked 
|  24|0x00000000ca400000, 0x00000000ca400000, 0x00000000ca500000|  0%| F|  |TAMS 0x00000000ca400000| PB 0x00000000ca400000| Untracked 
|  25|0x00000000ca500000, 0x00000000ca500000, 0x00000000ca600000|  0%| F|  |TAMS 0x00000000ca500000| PB 0x00000000ca500000| Untracked 
|  26|0x00000000ca600000, 0x00000000ca600000, 0x00000000ca700000|  0%| F|  |TAMS 0x00000000ca600000| PB 0x00000000ca600000| Untracked 
|  27|0x00000000ca700000, 0x00000000ca700000, 0x00000000ca800000|  0%| F|  |TAMS 0x00000000ca700000| PB 0x00000000ca700000| Untracked 
|  28|0x00000000ca800000, 0x00000000ca800000, 0x00000000ca900000|  0%| F|  |TAMS 0x00000000ca800000| PB 0x00000000ca800000| Untracked 
|  29|0x00000000ca900000, 0x00000000ca900000, 0x00000000caa00000|  0%| F|  |TAMS 0x00000000ca900000| PB 0x00000000ca900000| Untracked 
|  30|0x00000000caa00000, 0x00000000caa00000, 0x00000000cab00000|  0%| F|  |TAMS 0x00000000caa00000| PB 0x00000000caa00000| Untracked 
|  31|0x00000000cab00000, 0x00000000cab00000, 0x00000000cac00000|  0%| F|  |TAMS 0x00000000cab00000| PB 0x00000000cab00000| Untracked 
|  32|0x00000000cac00000, 0x00000000cac00000, 0x00000000cad00000|  0%| F|  |TAMS 0x00000000cac00000| PB 0x00000000cac00000| Untracked 
|  33|0x00000000cad00000, 0x00000000cad00000, 0x00000000cae00000|  0%| F|  |TAMS 0x00000000cad00000| PB 0x00000000cad00000| Untracked 
|  34|0x00000000cae00000, 0x00000000cae00000, 0x00000000caf00000|  0%| F|  |TAMS 0x00000000cae00000| PB 0x00000000cae00000| Untracked 
|  35|0x00000000caf00000, 0x00000000caf00000, 0x00000000cb000000|  0%| F|  |TAMS 0x00000000caf00000| PB 0x00000000caf00000| Untracked 
|  36|0x00000000cb000000, 0x00000000cb000000, 0x00000000cb100000|  0%| F|  |TAMS 0x00000000cb000000| PB 0x00000000cb000000| Untracked 
|  37|0x00000000cb100000, 0x00000000cb100000, 0x00000000cb200000|  0%| F|  |TAMS 0x00000000cb100000| PB 0x00000000cb100000| Untracked 
|  38|0x00000000cb200000, 0x00000000cb200000, 0x00000000cb300000|  0%| F|  |TAMS 0x00000000cb200000| PB 0x00000000cb200000| Untracked 
|  39|0x00000000cb300000, 0x00000000cb300000, 0x00000000cb400000|  0%| F|  |TAMS 0x00000000cb300000| PB 0x00000000cb300000| Untracked 
|  40|0x00000000cb400000, 0x00000000cb400000, 0x00000000cb500000|  0%| F|  |TAMS 0x00000000cb400000| PB 0x00000000cb400000| Untracked 
|  41|0x00000000cb500000, 0x00000000cb500000, 0x00000000cb600000|  0%| F|  |TAMS 0x00000000cb500000| PB 0x00000000cb500000| Untracked 
|  42|0x00000000cb600000, 0x00000000cb600000, 0x00000000cb700000|  0%| F|  |TAMS 0x00000000cb600000| PB 0x00000000cb600000| Untracked 
|  43|0x00000000cb700000, 0x00000000cb700000, 0x00000000cb800000|  0%| F|  |TAMS 0x00000000cb700000| PB 0x00000000cb700000| Untracked 
|  44|0x00000000cb800000, 0x00000000cb800000, 0x00000000cb900000|  0%| F|  |TAMS 0x00000000cb800000| PB 0x00000000cb800000| Untracked 
|  45|0x00000000cb900000, 0x00000000cb900000, 0x00000000cba00000|  0%| F|  |TAMS 0x00000000cb900000| PB 0x00000000cb900000| Untracked 
|  46|0x00000000cba00000, 0x00000000cba00000, 0x00000000cbb00000|  0%| F|  |TAMS 0x00000000cba00000| PB 0x00000000cba00000| Untracked 
|  47|0x00000000cbb00000, 0x00000000cbb00000, 0x00000000cbc00000|  0%| F|  |TAMS 0x00000000cbb00000| PB 0x00000000cbb00000| Untracked 
|  48|0x00000000cbc00000, 0x00000000cbc00000, 0x00000000cbd00000|  0%| F|  |TAMS 0x00000000cbc00000| PB 0x00000000cbc00000| Untracked 
|  49|0x00000000cbd00000, 0x00000000cbd00000, 0x00000000cbe00000|  0%| F|  |TAMS 0x00000000cbd00000| PB 0x00000000cbd00000| Untracked 
|  50|0x00000000cbe00000, 0x00000000cbe00000, 0x00000000cbf00000|  0%| F|  |TAMS 0x00000000cbe00000| PB 0x00000000cbe00000| Untracked 
|  51|0x00000000cbf00000, 0x00000000cbf00000, 0x00000000cc000000|  0%| F|  |TAMS 0x00000000cbf00000| PB 0x00000000cbf00000| Untracked 
|  52|0x00000000cc000000, 0x00000000cc000000, 0x00000000cc100000|  0%| F|  |TAMS 0x00000000cc000000| PB 0x00000000cc000000| Untracked 
|  53|0x00000000cc100000, 0x00000000cc1c7b48, 0x00000000cc200000| 78%| E|  |TAMS 0x00000000cc100000| PB 0x00000000cc100000| Complete 
|  54|0x00000000cc200000, 0x00000000cc300000, 0x00000000cc300000|100%| E|CS|TAMS 0x00000000cc200000| PB 0x00000000cc200000| Complete 
|  55|0x00000000cc300000, 0x00000000cc400000, 0x00000000cc400000|100%| E|CS|TAMS 0x00000000cc300000| PB 0x00000000cc300000| Complete 

Card table byte_map: [0x00000273c5b70000,0x00000273c5d30000] _byte_map_base: 0x00000273c552a000

Marking Bits: (CMBitMap*) 0x00000273b31ed300
 Bits: [0x00000273c5d30000, 0x00000273c6b00000)

Polling page: 0x00000273b1240000

Metaspace:

Usage:
  Non-class:      7.54 MB used.
      Class:    709.31 KB used.
       Both:      8.24 MB used.

Virtual space:
  Non-class space:       64.00 MB reserved,       7.62 MB ( 12%) committed,  1 nodes.
      Class space:        1.00 GB reserved,     768.00 KB ( <1%) committed,  1 nodes.
             Both:        1.06 GB reserved,       8.38 MB ( <1%) committed. 

Chunk freelists:
   Non-Class:  8.20 MB
       Class:  15.22 MB
        Both:  23.43 MB

MaxMetaspaceSize: unlimited
CompressedClassSpaceSize: 1.00 GB
Initial GC threshold: 21.00 MB
Current GC threshold: 21.00 MB
CDS: off
 - commit_granule_bytes: 65536.
 - commit_granule_words: 8192.
 - virtual_space_node_default_size: 8388608.
 - enlarge_chunks_in_place: 1.
 - use_allocation_guard: 0.


Internal statistics:

num_allocs_failed_limit: 0.
num_arena_births: 58.
num_arena_deaths: 0.
num_vsnodes_births: 2.
num_vsnodes_deaths: 0.
num_space_committed: 134.
num_space_uncommitted: 0.
num_chunks_returned_to_freelist: 0.
num_chunks_taken_from_freelist: 87.
num_chunk_merges: 0.
num_chunk_splits: 44.
num_chunks_enlarged: 15.
num_inconsistent_stats: 0.

CodeHeap 'non-profiled nmethods': size=120000Kb used=85Kb max_used=85Kb free=119914Kb
 bounds [0x00000273be640000, 0x00000273be8b0000, 0x00000273c5b70000]
CodeHeap 'profiled nmethods': size=120000Kb used=266Kb max_used=266Kb free=119733Kb
 bounds [0x00000273b6b70000, 0x00000273b6de0000, 0x00000273be0a0000]
CodeHeap 'non-nmethods': size=5760Kb used=1259Kb max_used=1259Kb free=4500Kb
 bounds [0x00000273be0a0000, 0x00000273be310000, 0x00000273be640000]
CodeCache: size=245760Kb, used=1610Kb, max_used=1610Kb, free=244147Kb
 total_blobs=676, nmethods=248, adapters=333, full_count=0
Compilation: enabled, stopped_count=0, restarted_count=0

Compilation events (20 events):
Event: 0.753 Thread 0x00000273c919f990 nmethod 221 0x00000273b6baec10 code [0x00000273b6baedc0, 0x00000273b6baf030]
Event: 0.753 Thread 0x00000273c919f990  222       3       java.lang.StringBuilder::length (5 bytes)
Event: 0.754 Thread 0x00000273c919f990 nmethod 222 0x00000273b6baf110 code [0x00000273b6baf2a0, 0x00000273b6baf3c0]
Event: 0.754 Thread 0x00000273c919f990  225       3       java.lang.String::substring (58 bytes)
Event: 0.755 Thread 0x00000273c919f990 nmethod 225 0x00000273b6baf490 code [0x00000273b6baf6c0, 0x00000273b6bafc98]
Event: 0.756 Thread 0x00000273c919f990  229       3       java.lang.invoke.LambdaForm::internArgument (85 bytes)
Event: 0.757 Thread 0x00000273c919f990 nmethod 229 0x00000273b6baff10 code [0x00000273b6bb00e0, 0x00000273b6bb0418]
Event: 0.757 Thread 0x00000273c919f990  230       3       java.lang.StringBuilder::toString (9 bytes)
Event: 0.757 Thread 0x00000273c919f990 nmethod 230 0x00000273b6bb0590 code [0x00000273b6bb0740, 0x00000273b6bb0948]
Event: 0.757 Thread 0x00000273c919f990  231       3       java.lang.String::<init> (7 bytes)
Event: 0.757 Thread 0x00000273c919f990 nmethod 231 0x00000273b6bb0a10 code [0x00000273b6bb0bc0, 0x00000273b6bb0d08]
Event: 0.758 Thread 0x00000273c919f990  232       3       sun.invoke.util.VerifyAccess::isTypeVisible (118 bytes)
Event: 0.761 Thread 0x00000273c919f990 nmethod 232 0x00000273b6bb0d90 code [0x00000273b6bb10a0, 0x00000273b6bb1fe0]
Event: 0.761 Thread 0x00000273c919f990  234       1       java.lang.invoke.MethodHandle::type (5 bytes)
Event: 0.761 Thread 0x00000273c919f990 nmethod 234 0x00000273be652890 code [0x00000273be652a20, 0x00000273be652ae8]
Event: 0.761 Thread 0x00000273c919f990  236       3       java.util.Objects::hashCode (13 bytes)
Event: 0.762 Thread 0x00000273c919f990 nmethod 236 0x00000273b6bb2510 code [0x00000273b6bb26c0, 0x00000273b6bb28d8]
Event: 0.762 Thread 0x00000273c919f990  237       1       sun.invoke.util.Wrapper::basicTypeChar (5 bytes)
Event: 0.762 Thread 0x00000273c919f990 nmethod 237 0x00000273be652e90 code [0x00000273be653020, 0x00000273be6530f0]
Event: 0.762 Thread 0x00000273c919f990  238       3       jdk.internal.org.objectweb.asm.Frame::execute (2305 bytes)

GC Heap History (0 events):
No events

Dll operation events (7 events):
Event: 0.025 Loaded shared library C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\java.dll
Event: 0.120 Loaded shared library C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\zip.dll
Event: 0.541 Loaded shared library C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\jimage.dll
Event: 0.592 Loaded shared library C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\net.dll
Event: 0.600 Loaded shared library C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\nio.dll
Event: 0.646 Loaded shared library C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\zip.dll
Event: 0.731 Loaded shared library C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\awt.dll

Deoptimization events (0 events):
No events

Classes loaded (20 events):
Event: 0.733 Loading class java/lang/invoke/MethodHandleImpl$AsVarargsCollector
Event: 0.733 Loading class java/lang/invoke/MethodHandleImpl$AsVarargsCollector done
Event: 0.737 Loading class java/lang/Long$LongCache
Event: 0.737 Loading class java/lang/Long$LongCache done
Event: 0.744 Loading class java/lang/invoke/BoundMethodHandle$Species_LL
Event: 0.744 Loading class java/lang/invoke/BoundMethodHandle$Species_LL done
Event: 0.752 Loading class java/lang/invoke/BoundMethodHandle$Species_LLL
Event: 0.752 Loading class java/lang/invoke/BoundMethodHandle$Species_LLL done
Event: 0.757 Loading class java/lang/invoke/MethodHandles$1
Event: 0.757 Loading class java/lang/invoke/MethodHandles$1 done
Event: 0.758 Loading class java/lang/invoke/BoundMethodHandle$Species_LLJ
Event: 0.758 Loading class java/lang/invoke/BoundMethodHandle$Species_LLJ done
Event: 0.763 Loading class java/lang/invoke/BoundMethodHandle$Species_LLLL
Event: 0.763 Loading class java/lang/invoke/BoundMethodHandle$Species_LLLL done
Event: 0.766 Loading class java/lang/invoke/BoundMethodHandle$Species_LLLLL
Event: 0.766 Loading class java/lang/invoke/BoundMethodHandle$Species_LLLLL done
Event: 0.767 Loading class java/util/TreeMap
Event: 0.768 Loading class java/util/NavigableMap
Event: 0.768 Loading class java/util/SortedMap
Event: 0.768 Loading class java/util/SequencedMap

Classes unloaded (0 events):
No events

Classes redefined (0 events):
No events

Internal exceptions (1 events):
Event: 0.672 Thread 0x00000273b0e8e870 Exception <a 'java/lang/ClassNotFoundException'{0x00000000cc2e6ea8}: sun/awt/resources/spi/awtProvider> (0x00000000cc2e6ea8) 
thrown [s\src\hotspot\share\classfile\systemDictionary.cpp, line 313]

ZGC Phase Switch (0 events):
No events

VM Operations (0 events):
No events

Memory protections (0 events):
No events

Nmethod flushes (0 events):
No events

Events (11 events):
Event: 0.116 Thread 0x00000273b0e8e870 Thread added: 0x00000273b0e8e870
Event: 0.279 Thread 0x00000273b0e8e870 Thread added: 0x00000273c9100d50
Event: 0.279 Thread 0x00000273b0e8e870 Thread added: 0x00000273c9104960
Event: 0.283 Thread 0x00000273b0e8e870 Thread added: 0x00000273c9139690
Event: 0.283 Thread 0x00000273b0e8e870 Thread added: 0x00000273c9179ee0
Event: 0.283 Thread 0x00000273b0e8e870 Thread added: 0x00000273c913b880
Event: 0.283 Thread 0x00000273b0e8e870 Thread added: 0x00000273c913bef0
Event: 0.283 Thread 0x00000273b0e8e870 Thread added: 0x00000273c913dad0
Event: 0.285 Thread 0x00000273b0e8e870 Thread added: 0x00000273c919f990
Event: 0.384 Thread 0x00000273b0e8e870 Thread added: 0x00000273c93117d0
Event: 0.398 Thread 0x00000273b0e8e870 Thread added: 0x00000273c931be60


Dynamic libraries:
0x00007ff7e5a60000 - 0x00007ff7e5a6e000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\javaw.exe
0x00007fff26f60000 - 0x00007fff271c6000 	C:\WINDOWS\SYSTEM32\ntdll.dll
0x00007fff26380000 - 0x00007fff26449000 	C:\WINDOWS\System32\KERNEL32.DLL
0x00007fff244a0000 - 0x00007fff2489a000 	C:\WINDOWS\System32\KERNELBASE.dll
0x00007fff24960000 - 0x00007fff24aac000 	C:\WINDOWS\System32\ucrtbase.dll
0x00007fff1c170000 - 0x00007fff1c18e000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\VCRUNTIME140.dll
0x00007fff1c260000 - 0x00007fff1c278000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\jli.dll
0x00007fff24f70000 - 0x00007fff25137000 	C:\WINDOWS\System32\USER32.dll
0x00007fff24ab0000 - 0x00007fff24ad7000 	C:\WINDOWS\System32\win32u.dll
0x00007fff26890000 - 0x00007fff268bb000 	C:\WINDOWS\System32\GDI32.dll
0x00007fff120e0000 - 0x00007fff12372000 	C:\WINDOWS\WinSxS\amd64_microsoft.windows.common-controls_6595b64144ccf1df_6.0.26100.8521_none_3e08b75ce33403b3\COMCTL32.dll
0x00007fff241f0000 - 0x00007fff2431b000 	C:\WINDOWS\System32\gdi32full.dll
0x00007fff267d0000 - 0x00007fff26879000 	C:\WINDOWS\System32\msvcrt.dll
0x00007fff24ae0000 - 0x00007fff24b83000 	C:\WINDOWS\System32\msvcp_win.dll
0x00007fff268c0000 - 0x00007fff268f2000 	C:\WINDOWS\System32\IMM32.DLL
0x00007fff1c250000 - 0x00007fff1c25c000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\vcruntime140_1.dll
0x00007ffefe600000 - 0x00007ffefe68d000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\msvcp140.dll
0x00007ffedd310000 - 0x00007ffede0b2000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\server\jvm.dll
0x00007fff26900000 - 0x00007fff269b6000 	C:\WINDOWS\System32\ADVAPI32.dll
0x00007fff26e00000 - 0x00007fff26eaa000 	C:\WINDOWS\System32\sechost.dll
0x00007fff24e00000 - 0x00007fff24f18000 	C:\WINDOWS\System32\RPCRT4.dll
0x00007fff26550000 - 0x00007fff265d0000 	C:\WINDOWS\System32\WS2_32.dll
0x00007fff1bac0000 - 0x00007fff1baf6000 	C:\WINDOWS\SYSTEM32\WINMM.dll
0x00007fff24070000 - 0x00007fff240ce000 	C:\WINDOWS\SYSTEM32\POWRPROF.dll
0x00007fff1bb00000 - 0x00007fff1bb0b000 	C:\WINDOWS\SYSTEM32\VERSION.dll
0x00007fff24030000 - 0x00007fff24044000 	C:\WINDOWS\SYSTEM32\UMPDC.dll
0x00007fff22f80000 - 0x00007fff22f9b000 	C:\WINDOWS\SYSTEM32\kernel.appcore.dll
0x00007fff1eb70000 - 0x00007fff1eb7a000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\jimage.dll
0x00007fff21350000 - 0x00007fff21592000 	C:\WINDOWS\SYSTEM32\DBGHELP.DLL
0x00007fff25f10000 - 0x00007fff26293000 	C:\WINDOWS\System32\combase.dll
0x00007fff262a0000 - 0x00007fff26379000 	C:\WINDOWS\System32\OLEAUT32.dll
0x00007fff0aab0000 - 0x00007fff0aaeb000 	C:\WINDOWS\SYSTEM32\dbgcore.DLL
0x00007fff24b90000 - 0x00007fff24c38000 	C:\WINDOWS\System32\bcryptPrimitives.dll
0x00007fff1d060000 - 0x00007fff1d080000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\java.dll
0x00007fff1c4d0000 - 0x00007fff1c4e8000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\zip.dll
0x00007fff25780000 - 0x00007fff25f04000 	C:\WINDOWS\System32\SHELL32.dll
0x00007fff21df0000 - 0x00007fff22670000 	C:\WINDOWS\SYSTEM32\windows.storage.dll
0x00007fff251d0000 - 0x00007fff252c6000 	C:\WINDOWS\System32\SHCORE.dll
0x00007fff26eb0000 - 0x00007fff26f17000 	C:\WINDOWS\System32\shlwapi.dll
0x00007fff24110000 - 0x00007fff24139000 	C:\WINDOWS\SYSTEM32\profapi.dll
0x00007fff1eb60000 - 0x00007fff1eb70000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\net.dll
0x00007fff18790000 - 0x00007fff188b9000 	C:\WINDOWS\SYSTEM32\WINHTTP.dll
0x00007fff234f0000 - 0x00007fff2355c000 	C:\WINDOWS\system32\mswsock.dll
0x00007fff1c4b0000 - 0x00007fff1c4c6000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\nio.dll
0x00007ffee7ab0000 - 0x00007ffee7c3f000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\awt.dll
0x00007fff20d70000 - 0x00007fff20e10000 	C:\WINDOWS\SYSTEM32\apphelp.dll

JVMTI agents: none

dbghelp: loaded successfully - version: 4.0.5 - missing functions: none
symbol engine: initialized successfully - sym options: 0x614 - pdb path: .;C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin;C:\WINDOWS\SYSTEM32;C:\WINDOWS\WinSxS\amd64_microsoft.windows.common-controls_6595b64144ccf1df_6.0.26100.8521_none_3e08b75ce33403b3;C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\server

VM Arguments:
jvm_args: -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8 -XX:+ShowCodeDetailsInExceptionMessages 
java_command: main.Main
java_class_path (initial): C:\Users\Asus\eclipse-workspace\StudyBuddy\bin;C:\Users\Asus\Downloads\mysql-connector-j-9.7.0\mysql-connector-j-9.7.0\mysql-connector-j-9.7.0.jar
Launcher Type: SUN_STANDARD

[Global flags]
     intx CICompilerCount                          = 3                                         {product} {ergonomic}
     uint ConcGCThreads                            = 1                                         {product} {ergonomic}
     uint G1ConcRefinementThreads                  = 4                                         {product} {ergonomic}
   size_t G1HeapRegionSize                         = 1048576                                   {product} {ergonomic}
    uintx GCDrainStackTargetSize                   = 64                                        {product} {ergonomic}
   size_t InitialHeapSize                          = 58720256                                  {product} {ergonomic}
   size_t MarkStackSize                            = 4194304                                   {product} {ergonomic}
   size_t MaxHeapSize                              = 926941184                                 {product} {ergonomic}
   size_t MaxNewSize                               = 555745280                                 {product} {ergonomic}
   size_t MinHeapDeltaBytes                        = 1048576                                   {product} {ergonomic}
   size_t MinHeapSize                              = 8388608                                   {product} {ergonomic}
    uintx NonNMethodCodeHeapSize                   = 5832780                                {pd product} {ergonomic}
    uintx NonProfiledCodeHeapSize                  = 122912730                              {pd product} {ergonomic}
    uintx ProfiledCodeHeapSize                     = 122912730                              {pd product} {ergonomic}
    uintx ReservedCodeCacheSize                    = 251658240                              {pd product} {ergonomic}
     bool SegmentedCodeCache                       = true                                      {product} {ergonomic}
     bool ShowCodeDetailsInExceptionMessages       = true                                   {manageable} {command line}
   size_t SoftMaxHeapSize                          = 926941184                              {manageable} {ergonomic}
     bool UseCompressedOops                        = true                           {product lp64_product} {ergonomic}
     bool UseG1GC                                  = true                                      {product} {ergonomic}
     bool UseLargePagesIndividualAllocation        = false                                  {pd product} {ergonomic}

Logging:
Log output configuration:
 #0: stdout all=warning uptime,level,tags foldmultilines=false
 #1: stderr all=off uptime,level,tags foldmultilines=false

Release file:
JAVA_VERSION="21.0.11" 
MODULES="java.base java.compiler java.datatransfer java.xml java.prefs java.desktop java.instrument java.logging java.management java.security.sasl java.naming java.rmi java.management.rmi java.net.http java.scripting java.security.jgss java.transaction.xa java.sql java.sql.rowset java.xml.crypto java.se java.smartcardio jdk.accessibility jdk.internal.jvmstat jdk.attach jdk.charsets jdk.internal.opt jdk.zipfs jdk.compiler jdk.crypto.ec jdk.crypto.cryptoki jdk.crypto.mscapi jdk.dynalink jdk.internal.ed jdk.editpad jdk.hotspot.agent jdk.httpserver jdk.internal.le jdk.internal.vm.ci jdk.internal.vm.compiler jdk.internal.vm.compiler.management jdk.jartool jdk.javadoc jdk.jcmd jdk.management jdk.management.agent jdk.jconsole jdk.jdeps jdk.jdwp.agent jdk.jdi jdk.jfr jdk.jshell jdk.jsobject jdk.jstatd jdk.localedata jdk.management.jfr jdk.naming.dns jdk.naming.rmi jdk.net jdk.nio.mapmode jdk.random jdk.sctp jdk.security.auth jdk.security.jgss jdk.unsupported jdk.unsupported.desktop jdk.xml.dom" 

Environment Variables:
PATH=C:/Users/Asus/.p2/pool/plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531/jre/bin/server;C:/Users/Asus/.p2/pool/plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531/jre/bin;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files\dotnet\;C:\Program Files (x86)\Windows Kits\10\Windows Performance Toolkit\;C:\WINDOWS\system32\config\systemprofile\AppData\Local\Muse Hub\lib;C:\Users\Asus\AppData\Local\Microsoft\WindowsApps;C:\Users\Asus\AppData\Local\Muse Hub\lib;;C:\WINDOWS\system32;
USERNAME=Asus
OS=Windows_NT
PROCESSOR_IDENTIFIER=AMD64 Family 23 Model 24 Stepping 1, AuthenticAMD
TMP=C:\Users\Asus\AppData\Local\Temp
TEMP=C:\Users\Asus\AppData\Local\Temp




Periodic native trim disabled

---------------  S Y S T E M  ---------------

OS:
 Windows 11 , 64 bit Build 26100 (10.0.26100.8521)
OS uptime: 0 days 10:04 hours

CPU: total 4 (initial active 4) (4 cores per cpu, 2 threads per core) family 23 model 24 stepping 1 microcode 0x8108109, cx8, cmov, fxsr, ht, mmx, 3dnowpref, sse, sse2, sse3, ssse3, sse4a, sse4.1, sse4.2, popcnt, lzcnt, tsc, tscinvbit, avx, avx2, aes, clmul, bmi1, bmi2, adx, sha, fma, vzeroupper, clflush, clflushopt, rdtscp, f16c
Processor Information for the first 4 processors :
  Max Mhz: 2600, Current Mhz: 2600, Mhz Limit: 2600

Memory: 4k page, system-wide physical 3533M (163M free)
TotalPageFile size 14285M (AvailPageFile size 2M)
current process WorkingSet (physical memory assigned to process): 43M, peak: 43M
current process commit charge ("private bytes"): 126M, peak: 126M

vm_info: OpenJDK 64-Bit Server VM (21.0.11+10-LTS) for windows-amd64 JRE (21.0.11+10-LTS), built on 2026-04-21T00:00:00Z by "admin" with MS VC++ 17.12 (VS2022)

END.
