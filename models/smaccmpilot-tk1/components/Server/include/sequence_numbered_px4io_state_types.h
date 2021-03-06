/* This file has been autogenerated by Ivory
 * Compiler version  0.1.0.5
 */
#ifndef __SEQUENCE_NUMBERED_PX4IO_STATE_TYPES_H__
#define __SEQUENCE_NUMBERED_PX4IO_STATE_TYPES_H__
#ifdef __cplusplus
extern "C" {
#endif
#include "ivory.h"
#include "ivory_serialize.h"
#include "sequence_num_types.h"
#include "px4io_state_types.h"
typedef struct sequence_numbered_px4io_state {
            uint32_t seqnum;
            struct px4io_state val;
        } sequence_numbered_px4io_state;
void sequence_numbered_px4io_state_get_le(const uint8_t *n_var0, uint32_t n_var1, struct sequence_numbered_px4io_state *n_var2);
void sequence_numbered_px4io_state_get_be(const uint8_t *n_var0, uint32_t n_var1, struct sequence_numbered_px4io_state *n_var2);
void sequence_numbered_px4io_state_set_le(uint8_t *n_var0, uint32_t n_var1, const struct sequence_numbered_px4io_state *n_var2);
void sequence_numbered_px4io_state_set_be(uint8_t *n_var0, uint32_t n_var1, const struct sequence_numbered_px4io_state *n_var2);

#ifdef __cplusplus
}
#endif
#endif /* __SEQUENCE_NUMBERED_PX4IO_STATE_TYPES_H__ */
