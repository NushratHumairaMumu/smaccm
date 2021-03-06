/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.0
 */
#ifndef __TOWER_TASK_USERCODE_DATALINK_336_H__
#define __TOWER_TASK_USERCODE_DATALINK_336_H__
#ifdef __cplusplus
extern "C" {
#endif
#include <ivory_hw_prim.h>
#include "controloutput_type.h"
#include "data_rate.h"
#include "flightmode_type.h"
#include "gcsstream_timing.h"
#include "gps_type.h"
#include "hxstream_state_module.h"
#include "ivory.h"
#include "mavlink_hil_state_msg.h"
#include "motors_type.h"
#include "optflow_type.h"
#include "radio_info_type.h"
#include "radio_stat_type.h"
#include "sensors_type.h"
#include "tower_primitives.h"
#include "tower_task_loop_datalink_336.h"
#include "userinput_type.h"
extern struct hxstream_state hx_decoder_state_347;
extern uint32_t airdata_frames_decoded_348;
extern uint8_t airdata_decoded_349[96U];
extern bool airdata_overrun_350;
extern uint32_t rs_success_351;
extern uint32_t rs_fail_352;
extern uint8_t rs_msgtype_353;
extern int32_t rs_len_354;
extern uint8_t rs_buf_355[48U];
void eventhandler_datalink_336_chan320_356(const uint8_t* n_var0);
void eventhandler_datalink_336_chan332_363(const uint8_t n_var0[96U]);
void eventhandler_datalink_336_per250_367(const uint32_t* n_var0);

#ifdef __cplusplus
}
#endif
#endif /* __TOWER_TASK_USERCODE_DATALINK_336_H__ */