#
# There is insufficient memory for the Java Runtime Environment to continue.
# Native memory allocation (mmap) failed to map 58720256 bytes. Error detail: G1 virtual space
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
#  Out of Memory Error (os_windows.cpp:3714), pid=15304, tid=21724
#
# JRE version:  (21.0.11+10) (build )
# Java VM: OpenJDK 64-Bit Server VM (21.0.11+10-LTS, mixed mode, sharing, tiered, compressed oops, compressed class ptrs, g1 gc, windows-amd64)
# No core dump will be written. Minidumps are not enabled by default on client versions of Windows
#

---------------  S U M M A R Y ------------

Command Line: -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8 -XX:+ShowCodeDetailsInExceptionMessages main.Main

Host: AMD Ryzen 3 3250U with Radeon Graphics         , 4 cores, 3G,  Windows 11 , 64 bit Build 26100 (10.0.26100.8521)
Time: Fri Jun 26 05:17:30 2026 Malay Peninsula Standard Time elapsed time: 0.099531 seconds (0d 0h 0m 0s)

---------------  T H R E A D  ---------------

Current thread (0x00000206e0931380):  JavaThread "Unknown thread" [_thread_in_vm, id=21724, stack(0x000000c2c7f00000,0x000000c2c8000000) (1024K)]

Stack: [0x000000c2c7f00000,0x000000c2c8000000]
Native frames: (J=compiled Java code, j=interpreted, Vv=VM code, C=native code)
V  [jvm.dll+0x6d7e19]
V  [jvm.dll+0x8b5096]
V  [jvm.dll+0x8b764e]
V  [jvm.dll+0x8b7d33]
V  [jvm.dll+0x284596]
V  [jvm.dll+0x6d4735]
V  [jvm.dll+0x6c845a]
V  [jvm.dll+0x35ef08]
V  [jvm.dll+0x366b46]
V  [jvm.dll+0x3b7c2e]
V  [jvm.dll+0x3b7ed8]
V  [jvm.dll+0x33310c]
V  [jvm.dll+0x333c5b]
V  [jvm.dll+0x87f04b]
V  [jvm.dll+0x3c4bb1]
V  [jvm.dll+0x868295]
V  [jvm.dll+0x457c41]
V  [jvm.dll+0x459831]
C  [jli.dll+0x52dc]
C  [ucrtbase.dll+0x2cd30]
C  [KERNEL32.DLL+0x2e957]
C  [ntdll.dll+0x87c1c]


---------------  P R O C E S S  ---------------

Threads class SMR info:
_java_thread_list=0x00007ffeddf5b1c8, length=0, elements={
}

Java Threads: ( => current thread )
Total: 0

Other Threads:
  0x00000206e2e0dbe0 WorkerThread "GC Thread#0"                     [id=16808, stack(0x000000c2c8000000,0x000000c2c8100000) (1024K)]
  0x00000206e2e15a50 ConcurrentGCThread "G1 Main Marker"            [id=17368, stack(0x000000c2c8100000,0x000000c2c8200000) (1024K)]
  0x00000206e2e17b80 WorkerThread "G1 Conc#0"                       [id=10072, stack(0x000000c2c8200000,0x000000c2c8300000) (1024K)]

[error occurred during error reporting (printing all threads), id 0xc0000005, EXCEPTION_ACCESS_VIOLATION (0xc0000005) at pc=0x00007ffedd6557f7]
VM state: not at safepoint (not fully initialized)

VM Mutex/Monitor currently owned by a thread:  ([mutex/lock_event])
[0x00007ffeddfcf670] Heap_lock - owner thread: 0x00000206e0931380

Heap address: 0x00000000c8c00000, size: 884 MB, Compressed Oops mode: 32-bit

CDS archive(s) mapped at: [0x0000000000000000-0x0000000000000000-0x0000000000000000), size 0, SharedBaseAddress: 0x0000000800000000, ArchiveRelocationMode: 1.
Narrow klass base: 0x0000000000000000, Narrow klass shift: 0, Narrow klass range: 0x0

GC Precious Log:
 CardTable entry size: 512
 Card Set container configuration: InlinePtr #cards 5 size 8 Array Of Cards #cards 12 size 40 Howl #buckets 4 coarsen threshold 1843 Howl Bitmap #cards 512 size 80 coarsen threshold 460 Card regions per heap region 1 cards per card region 2048

Heap:
 garbage-first heap   total 0K, used 0K [0x00000000c8c00000, 0x0000000100000000)
  region size 1024K, 0 young (0K), 0 survivors (0K)

[error occurred during error reporting (printing heap information), id 0xc0000005, EXCEPTION_ACCESS_VIOLATION (0xc0000005) at pc=0x00007ffedda41789]
GC Heap History (0 events):
No events

Dll operation events (1 events):
Event: 0.032 Loaded shared library C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\java.dll

Deoptimization events (0 events):
No events

Classes loaded (0 events):
No events

Classes unloaded (0 events):
No events

Classes redefined (0 events):
No events

Internal exceptions (0 events):
No events

ZGC Phase Switch (0 events):
No events

VM Operations (0 events):
No events

Memory protections (0 events):
No events

Nmethod flushes (0 events):
No events

Events (0 events):
No events


Dynamic libraries:
0x00007ff7e5a60000 - 0x00007ff7e5a6e000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\javaw.exe
0x00007fff26f60000 - 0x00007fff271c6000 	C:\WINDOWS\SYSTEM32\ntdll.dll
0x00007fff26380000 - 0x00007fff26449000 	C:\WINDOWS\System32\KERNEL32.DLL
0x00007fff244a0000 - 0x00007fff2489a000 	C:\WINDOWS\System32\KERNELBASE.dll
0x00007fff24960000 - 0x00007fff24aac000 	C:\WINDOWS\System32\ucrtbase.dll
0x00007fff1c260000 - 0x00007fff1c278000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\jli.dll
0x00007fff24f70000 - 0x00007fff25137000 	C:\WINDOWS\System32\USER32.dll
0x00007fff24ab0000 - 0x00007fff24ad7000 	C:\WINDOWS\System32\win32u.dll
0x00007fff26890000 - 0x00007fff268bb000 	C:\WINDOWS\System32\GDI32.dll
0x00007fff241f0000 - 0x00007fff2431b000 	C:\WINDOWS\System32\gdi32full.dll
0x00007fff24ae0000 - 0x00007fff24b83000 	C:\WINDOWS\System32\msvcp_win.dll
0x00007fff1c170000 - 0x00007fff1c18e000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\VCRUNTIME140.dll
0x00007fff120e0000 - 0x00007fff12372000 	C:\WINDOWS\WinSxS\amd64_microsoft.windows.common-controls_6595b64144ccf1df_6.0.26100.8521_none_3e08b75ce33403b3\COMCTL32.dll
0x00007fff267d0000 - 0x00007fff26879000 	C:\WINDOWS\System32\msvcrt.dll
0x00007fff268c0000 - 0x00007fff268f2000 	C:\WINDOWS\System32\IMM32.DLL
0x00007fff1c250000 - 0x00007fff1c25c000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\vcruntime140_1.dll
0x00007ffefe600000 - 0x00007ffefe68d000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\msvcp140.dll
0x00007ffedd310000 - 0x00007ffede0b2000 	C:\Users\Asus\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.11.v20260515-1531\jre\bin\server\jvm.dll
0x00007fff26900000 - 0x00007fff269b6000 	C:\WINDOWS\System32\ADVAPI32.dll
0x00007fff26e00000 - 0x00007fff26eaa000 	C:\WINDOWS\System32\sechost.dll
0x00007fff24e00000 - 0x00007fff24f18000 	C:\WINDOWS\System32\RPCRT4.dll
0x00007fff26550000 - 0x00007fff265d0000 	C:\WINDOWS\System32\WS2_32.dll
0x00007fff24070000 - 0x00007fff240ce000 	C:\WINDOWS\SYSTEM32\POWRPROF.dll
0x00007fff1bac0000 - 0x00007fff1baf6000 	C:\WINDOWS\SYSTEM32\WINMM.dll
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
<release file has not been read>
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
OS uptime: 0 days 9:54 hours

CPU: total 4 (initial active 4) (4 cores per cpu, 2 threads per core) family 23 model 24 stepping 1 microcode 0x8108109, cx8, cmov, fxsr, ht, mmx, 3dnowpref, sse, sse2, sse3, ssse3, sse4a, sse4.1, sse4.2, popcnt, lzcnt, tsc, tscinvbit, avx, avx2, aes, clmul, bmi1, bmi2, adx, sha, fma, vzeroupper, clflush, clflushopt, rdtscp, f16c
Processor Information for the first 4 processors :
  Max Mhz: 2600, Current Mhz: 2600, Mhz Limit: 2600

Memory: 4k page, system-wide physical 3533M (230M free)
TotalPageFile size 14285M (AvailPageFile size 21M)
current process WorkingSet (physical memory assigned to process): 12M, peak: 12M
current process commit charge ("private bytes"): 51M, peak: 107M

vm_info: OpenJDK 64-Bit Server VM (21.0.11+10-LTS) for windows-amd64 JRE (21.0.11+10-LTS), built on 2026-04-21T00:00:00Z by "admin" with MS VC++ 17.12 (VS2022)

END.
